public class Car extends Vehicle {
    public Car(String vehicleId, String model, RentalCostStrategy strategy) {
        super(vehicleId, model, strategy);
    }

    @Override
    public double getBaseRentalRate() {
        return 50.0; // Base rate for cars
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
