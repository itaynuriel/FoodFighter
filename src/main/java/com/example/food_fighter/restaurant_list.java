package com.example.food_fighter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import Adapter.RestaurantAdapter;
import Interfaces.RestaurantCallBack;
import Models.Restaurant;
import Utilities.DataManager;
import Utilities.SignalGenerator;

public class restaurant_list extends AppCompatActivity {

    private Button backBTN;

    private RecyclerView main_LST_restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);


        backBTN= findViewById(R.id.back_Button_of_list);
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurant_list.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        main_LST_restaurants = findViewById(R.id.main_LST_restaurants);
        initViews();
    }

    private void initViews() {
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(DataManager.getRestaurants());
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