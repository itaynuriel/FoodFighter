package Models;

public class Restaurant {
    private String name = "";
    private String image = "";

    private int number = 0;

    private String address = "";
    private long reviews = 0;
    private boolean isFavorite = false;
    private float rating = 0.0f;

    public Restaurant() {}

    public String getName() {
        return name;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Restaurant setImage(String image) {
        this.image = image;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Restaurant setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Restaurant setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getReviews() {
        return reviews;
    }

    public Restaurant setReviews(long reviews) {
        this.reviews = reviews;
        return this;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public Restaurant setFavorite(boolean favorite) {
        isFavorite = favorite;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Restaurant setRating(float rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        return "Restaurant {" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", number=" + number +
                ", address=" + address +
                ", reviews=" + reviews +
                ", isFavorite=" + isFavorite +
                ", rating=" + rating +
                '}';
    }
}
