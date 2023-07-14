package Interfaces;

import android.view.View;

import Models.Restaurant;

public interface RestaurantCallBack {
    void itemClicked (Restaurant restaurant,int position);
    void favoriteClicked (Restaurant restaurant, int position);

}
