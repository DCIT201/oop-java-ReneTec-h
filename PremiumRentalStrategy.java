


public class PremiumRentalStrategy implements RentalCostStrategy {
    @Override
    public double calculateCost(int days, double baseRate) {
        return baseRate * days + (days > 5 ? 50 : 0); // Extra charge for long rentals
    }
}
