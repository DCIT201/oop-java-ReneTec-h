public class StandardRentalStrategy implements RentalCostStrategy {
    @Override
    public double calculateCost(int days, double baseRate) {
        return baseRate * days;
    }
}