package com.example.food_fighter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Adapter.RestaurantAdapter;
import Interfaces.RestaurantCallBack;
import Models.Restaurant;
import Utilities.DataManager;
import Utilities.SignalGenerator;

public class restaurant_search extends AppCompatActivity {

    private Button backBTN;

    private RestaurantAdapter restaurantAdapter;
    private List<Restaurant> restaurantList;
    private SearchView searchView;
    private RecyclerView main_LST_restaurants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_search);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                restaurantAdapter.setFilteredList(filterList(newText));
                return true;
            }
        });

        restaurantList = DataManager.getRestaurants();
        backBTN= findViewById(R.id.back_Button_of_search);
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurant_search.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        main_LST_restaurants = findViewById(R.id.main_LST_restaurants);
        initViews();
    }

    public ArrayList<Restaurant> filterList(String text) {
        ArrayList<Restaurant> filteredList = new ArrayList<>();
        filteredList.clear();
//        if(text.isEmpty())
//            filteredList.addAll(restaurantList);
        for(Restaurant restaurant : restaurantList)
        {
            if(restaurant.getName().toLowerCase().contains(text.toLowerCase()))
                filteredList.add(restaurant);
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this, "NO SUCH RESTAURANT :( ", Toast.LENGTH_SHORT).show();
        }
        return filteredList;
    }

    private void initViews() {
        restaurantAdapter = new RestaurantAdapter(DataManager.getRestaurants());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_restaurants.setLayoutManager(linearLayoutManager);
        main_LST_restaurants.setAdapter(restaurantAdapter);
        restaurantAdapter.setRestaurantCallback(new RestaurantCallBack() {
            @Override
            public void itemClicked(Restaurant restaurant, int position) {
                SignalGenerator.getInstance().toast(restaurant.getName(), Toast.LENGTH_SHORT);
            }

            @Override
            public void favoriteClicked(Restaurant restaurant, int position) {
                restaurant.setFavorite(!restaurant.isFavorite());
                main_LST_restaurants.getAdapter().notifyItemChanged(position);
            }
        });
    }
}