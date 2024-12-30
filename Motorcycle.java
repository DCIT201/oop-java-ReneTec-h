public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, RentalCostStrategy strategy) {
        super(vehicleId, model, strategy);
    }

    @Override
    public double getBaseRentalRate() {
        return 30.0; // Base rate for motorcycles
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}

