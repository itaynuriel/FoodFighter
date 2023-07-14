package com.example.food_fighter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
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

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_restaurants;

    private SearchView searchView;
    private Button RestaurantListBTN;
    private Button RestaurantSearchBTN;
    private Button FavoritesBTN;
    private Button TopRestaurantsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestaurantListBTN= findViewById(R.id.main_BTN_option1);
        RestaurantListBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, restaurant_list.class);
                startActivity(intent);
                finish();
            }
        });

        RestaurantSearchBTN = findViewById(R.id.main_BTN_option2);
        RestaurantSearchBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, restaurant_search.class);
                startActivity(intent);
                finish();
            }
        });

        FavoritesBTN= findViewById(R.id.main_BTN_option3);
        FavoritesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        TopRestaurantsBTN= findViewById(R.id.main_BTN_option4);
        TopRestaurantsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

////        findViews();
////        initViews();
    }
//
//    private void initViews() {
//        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(DataManager.getRestaurants());
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
//        main_LST_restaurants.setLayoutManager(linearLayoutManager);
//        main_LST_restaurants.setAdapter(restaurantAdapter);
//        restaurantAdapter.setRestaurantCallback(new RestaurantCallBack() {
//            @Override
//            public void itemClicked(Restaurant restaurant, int position) {
//                SignalGenerator.getInstance().toast(restaurant.getName(), Toast.LENGTH_SHORT);
//            }
//
//            @Override
//            public void favoriteClicked(Restaurant restaurant, int position) {
//                restaurant.setFavorite(!restaurant.isFavorite());
//                main_LST_restaurants.getAdapter().notifyItemChanged(position);
//            }
//        });
//    }
//
//    private void findViews() {
//
//        main_LST_restaurants = findViewById(R.id.main_LST_restaurants);
//    }


}