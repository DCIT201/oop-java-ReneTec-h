public class RentalTransaction {
    private final Customer customer;
    private final Vehicle vehicle;
    private final int rentalDays;

    private RentalTransaction(Builder builder) {
        this.customer = builder.customer;
        this.vehicle = builder.vehicle;
        this.rentalDays = builder.rentalDays;
    }

    public static class Builder {
        private Customer customer;
        private Vehicle vehicle;
        private int rentalDays;

        public Builder withCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder withVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder forDays(int days) {
            this.rentalDays = days;
            return this;
        }

        public RentalTransaction build() {
            return new RentalTransaction(this);
        }
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }
}

