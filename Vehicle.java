public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private boolean isAvailable;
    private RentalCostStrategy rentalCostStrategy;

    public Vehicle(String vehicleId, String model, RentalCostStrategy rentalCostStrategy) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.isAvailable = true;
        this.rentalCostStrategy = rentalCostStrategy;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double calculateRentalCost(int days) {
        return rentalCostStrategy.calculateCost(days, getBaseRentalRate());
    }

    public abstract double getBaseRentalRate();

    public abstract String getVehicleType();
}

