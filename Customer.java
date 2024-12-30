import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int loyaltyPoints;
    private List<Double> ratings;

    public Customer(String name) {
        this.name = name;
        this.loyaltyPoints = 0;
        this.ratings = new ArrayList<>();
    }

    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
    }

    public void rate(double rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        return ratings.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    // Getters for encapsulation
    public String getName() {
        return name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public List<Double> getRatings() {
        return new ArrayList<>(ratings); // Return a copy to ensure encapsulation
    }
}
