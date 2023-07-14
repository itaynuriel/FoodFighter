package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_fighter.R;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

import Interfaces.RestaurantCallBack;
import Models.Restaurant;
import Utilities.ImageLoader;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private ArrayList<Restaurant> restaurants;

    public void setFilteredList (ArrayList<Restaurant> filteredList)
    {
        this.restaurants = filteredList;
        notifyDataSetChanged();
    }
    public RestaurantAdapter(ArrayList<Restaurant> restaurants) {

        this.restaurants= restaurants;
    }

    private RestaurantCallBack restaurantCallback;

    public void setRestaurantCallback(RestaurantCallBack restaurantCallback) {
        this.restaurantCallback = restaurantCallback;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_item, parent, false);
        RestaurantViewHolder restaurantViewHolder = new RestaurantViewHolder(view);
        return restaurantViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = getItem(position);
        holder.restaurant_LBL_name.setText(restaurant.getName());
        holder.restaurant_LBL_number.setText(restaurant.getNumber()+ " ");
        holder.restaurant_LBL_address.setText(restaurant.getAddress()+" ");
        holder.restaurant_LBL_reviews.setText(restaurant.getReviews() + " Reviews");
        holder.restaurant_RTG_rating.setRating(restaurant.getRating() / 20);
        ImageLoader.getInstance().loadImage(restaurant.getImage(), holder.restaurant_IMG_poster);
        if (restaurant.isFavorite())
            ImageLoader.getInstance().loadImage(R.drawable.love, holder.restaurant_IMG_favorite);
        else
            ImageLoader.getInstance().loadImage(R.drawable.like, holder.restaurant_IMG_favorite);

    }

    @Override
    public int getItemCount() {
        return this.restaurants == null ? 0 : this.restaurants.size();
    }

    private Restaurant getItem(int position) {
        return this.restaurants.get(position);
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        private ShapeableImageView restaurant_IMG_favorite;

        private AppCompatRatingBar restaurant_RTG_rating;

        private MaterialTextView restaurant_LBL_reviews;

        private MaterialTextView restaurant_LBL_address;

        private MaterialTextView restaurant_LBL_number;

        private MaterialTextView restaurant_LBL_name;

        private ShapeableImageView restaurant_IMG_poster;


        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurant_IMG_favorite = itemView.findViewById(R.id.restaurant_IMG_favorite);
            restaurant_RTG_rating = itemView.findViewById(R.id.restaurant_RTG_rating);
            restaurant_RTG_rating.setIsIndicator(true);
            restaurant_LBL_address = itemView.findViewById(R.id.restaurant_LBL_address);
            restaurant_LBL_reviews = itemView.findViewById(R.id.restaurant_LBL_reviews);
            restaurant_LBL_number = itemView.findViewById(R.id.restaurant_LBL_number);
            restaurant_LBL_name = itemView.findViewById(R.id.restaurant_LBL_name);
            restaurant_IMG_poster = itemView.findViewById(R.id.restaurant_IMG_poster);
            restaurant_IMG_favorite.setOnClickListener(v -> {
                if (restaurantCallback != null)
                    restaurantCallback.favoriteClicked(getItem(getAdapterPosition()), getAdapterPosition());
            });
            itemView.setOnClickListener(v -> {
                if (restaurantCallback != null)
                    restaurantCallback.itemClicked(getItem(getAdapterPosition()), getAdapterPosition());
            });
        }
    }
}
