package com.example.food_fighter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
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

public class Favorites extends AppCompatActivity {

    private Button backBTN;
    private RestaurantAdapter restaurantAdapter = null;

    private RecyclerView main_LST_restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user == null)
            startActivity(new Intent(Favorites.this, LoginActivity.class));

        backBTN= findViewById(R.id.back_Button_of_list);
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        main_LST_restaurants = findViewById(R.id.main_LST_restaurants);
        initViews();
    }

    private void initViews() {
        ArrayList<Restaurant> favorite = new ArrayList<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user == null)
            startActivity(new Intent(Favorites.this, LoginActivity.class));

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("user-likes").document(user.getUid()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Map<String, Object> userLikes = document.getData();
                        for (Restaurant restaurant : DataManager.getRestaurants()) {
                            if (userLikes.containsKey(restaurant.getName())) {
                                if ((boolean) userLikes.get(restaurant.getName())) {
                                    favorite.add(restaurant);
                                }
                            }
                        }
                        restaurantAdapter.setFilteredList(favorite);
//                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                    } else {
//                        Log.d(TAG, "No such document");
                    }
                } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                }
            }
        });





        restaurantAdapter = new RestaurantAdapter(favorite);
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
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user == null)
                    startActivity(new Intent(Favorites.this, LoginActivity.class));

                FirebaseFirestore db = FirebaseFirestore.getInstance();
                Map<String, Object> data = new HashMap<>();
                data.put(restaurant.getName(), restaurant.isFavorite());
                db.collection("user-likes").document(user.getUid()).set(data, SetOptions.merge()).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(Favorites.this, "Liked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                            }
                        });


                main_LST_restaurants.getAdapter().notifyItemChanged(position);
            }
        });
    }
}