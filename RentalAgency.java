import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String type) {
        return fleet.stream()
                .filter(v -> v.isAvailable() && v.getVehicleType().equalsIgnoreCase(type))
                .findFirst()
                .orElse(null);
    }

   public List<Vehicle> generateReport() {
    List<Vehicle> availableVehicles = new ArrayList<>();
    for (Vehicle vehicle : fleet) {
        if (vehicle.isAvailable()) {
            availableVehicles.add(vehicle);
        }
    }
    return availableVehicles;
}

}
