public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, RentalCostStrategy strategy) {
        super(vehicleId, model, strategy);
    }

    @Override
    public double getBaseRentalRate() {
        return 100.0; // Base rate for trucks
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}
