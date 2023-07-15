package com.example.food_fighter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Adapter.RestaurantAdapter;
import Interfaces.RestaurantCallBack;
import Models.Restaurant;
import Utilities.DataManager;
import Utilities.SignalGenerator;

public class hot_brands extends AppCompatActivity {

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
                Intent intent = new Intent(hot_brands.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        main_LST_restaurants = findViewById(R.id.main_LST_restaurants);
        initViews();
    }

    private void initViews() {
        ArrayList<Restaurant> restaurants = DataManager.getRestaurants();
        ArrayList<Restaurant> hotRestaurants = new ArrayList<>();

        hotRestaurants.add(restaurants.get(0));
        hotRestaurants.add(restaurants.get(11));
        hotRestaurants.add(restaurants.get(12));
        hotRestaurants.add(restaurants.get(20));

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(hotRestaurants);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        main_LST_restaurants.setLayoutManager(linearLayoutManager);
        main_LST_restaurants.setAdapter(restaurantAdapter);
    }
}