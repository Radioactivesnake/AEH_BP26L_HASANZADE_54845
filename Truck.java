public class Truck extends Vehicle implements FuelType {
    private double loadCapacity;
    private String engineType;

    public Truck(String registrationNumber, String vinNumber, String color,
                 double price, double fuelConsumption, double fuelLevel,
                 double mileage, double loadCapacity, String engineType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.engineType = engineType;
    }

    public double getLoadCapacity() { return loadCapacity; }

    @Override
    public String getFuelType() { return engineType; }

    @Override
    public String toString() {
        return super.toString() + " | Load capacity: " + loadCapacity + "t | Engine: " + getFuelType();
    }
}
