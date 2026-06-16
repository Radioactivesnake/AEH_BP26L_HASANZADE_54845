public class PassengerCar extends Vehicle implements FuelType {
    private int numberOfDoors;
    private String engineType;

    public PassengerCar(String registrationNumber, String vinNumber, String color,
                        double price, double fuelConsumption, double fuelLevel,
                        double mileage, int numberOfDoors, String engineType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
    }

    public int getNumberOfDoors() { return numberOfDoors; }

    @Override
    public String getFuelType() { return engineType; }

    @Override
    public String toString() {
        return super.toString() + " | Doors: " + numberOfDoors + " | Engine: " + getFuelType();
    }
}
