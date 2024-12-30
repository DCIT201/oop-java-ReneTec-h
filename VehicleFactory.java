public class VehicleFactory {
    public static Vehicle createVehicle(String type, String id, String model) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car(id, model, new StandardRentalStrategy());
            case "motorcycle" -> new Motorcycle(id, model, new PremiumRentalStrategy());
            case "truck" -> new Truck(id, model, new PremiumRentalStrategy());
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + type);
        };
    }
}

