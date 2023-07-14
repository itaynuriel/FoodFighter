package Utilities;

import android.content.Context;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import androidx.lifecycle.GenericLifecycleObserver;

import com.bumptech.glide.Glide;
import com.example.food_fighter.R;

public class ImageLoader {
    private static ImageLoader instance;

    private static Context appContext;

    private ImageLoader(Context context){
        this.appContext = context;
    }

    public static ImageLoader getInstance() {
        return instance;
    }

    public static ImageLoader initImageLoader (Context context){
        if (instance == null)
            instance = new ImageLoader(context);
        return instance;
    }

    public void loadImage(String imageURL, ImageView imageView){
        Glide
                .with(this.appContext)
                .load(imageURL)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }

    public void loadImage(int imageResource, ImageView imageView){
        Glide
                .with(this.appContext)
                .load(imageResource)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }
}
