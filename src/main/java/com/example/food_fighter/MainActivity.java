package com.example.food_fighter;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.firestore.DocumentSnapshot;
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

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_restaurants;

    private SearchView searchView;
    private Button RestaurantListBTN;
    private Button RestaurantSearchBTN;

    private Button FavoritesBTN;
    private Button LogoutBTN;
    private Button TopRestaurantsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user == null)
            startActivity(new Intent(MainActivity.this, LoginActivity.class));

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("user-likes").document(user.getUid()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Map<String, Object> userLikes = document.getData();
                        for (Restaurant restaurant : DataManager.getRestaurants()) {
                            if (userLikes.containsKey(restaurant.getName()))
                                restaurant.setFavorite((boolean) userLikes.get(restaurant.getName()));
                             else
                                restaurant.setFavorite(false);
                        }
                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                    } else {
                        for (Restaurant restaurant : DataManager.getRestaurants()) {
                                restaurant.setFavorite(false);
                        }
                        Log.d(TAG, "No such document");
                    }
                } else {
                    Log.d(TAG, "get failed with ", task.getException());
                }
            }
        });





        RestaurantListBTN= findViewById(R.id.main_BTN_option1);
        RestaurantListBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, restaurant_list.class);
                startActivity(intent);
                finish();
            }
        });

        LogoutBTN = findViewById(R.id.logout_BTN);

        LogoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
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
                Intent intent = new Intent(MainActivity.this, Favorites.class);
                startActivity(intent);
                finish();
            }
        });

        TopRestaurantsBTN= findViewById(R.id.main_BTN_option4);
        TopRestaurantsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hot_brands.class);
                startActivity(intent);
                finish();
            }
        });

    }
}