import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new customer
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine().trim();
        Customer customer = new Customer(customerName);

        // Add loyalty points
        int points = -1;
        while (points < 0) {
            System.out.print("Enter loyalty points to add (positive value): ");
            if (scanner.hasNextInt()) {
                points = scanner.nextInt();
                if (points >= 0) {
                    customer.addLoyaltyPoints(points);
                } else {
                    System.out.println("Loyalty points cannot be negative.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Add ratings
        System.out.print("Enter a rating (0.0 to 5.0): ");
double rating = -1;
while (rating < 0 || rating > 5) {
    if (scanner.hasNextDouble()) {
        rating = scanner.nextDouble();
        if (rating >= 0.0 && rating <= 5.0) {
            customer.rate(rating);
        } else {
            System.out.println("Rating must be between 0.0 and 5.0. Please try again.");
        }
    } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next(); // Clear invalid input
    }
}


        // Display customer details
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Loyalty Points: " + customer.getLoyaltyPoints());
        System.out.println("Average Rating: " + customer.getAverageRating());

        scanner.close(); // Close the scanner
    }
}

class Customer {
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

    public String getName() {
        return name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public List<Double> getRatings() {
        return new ArrayList<>(ratings);
    }
}
