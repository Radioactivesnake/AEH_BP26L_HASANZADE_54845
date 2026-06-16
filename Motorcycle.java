public class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;
    private String engineType;

    public Motorcycle(String registrationNumber, String vinNumber, String color,
                      double price, double fuelConsumption, double fuelLevel,
                      double mileage, boolean hasSidecar, String engineType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
        this.engineType = engineType;
    }

    public boolean isHasSidecar() { return hasSidecar; }

    @Override
    public String getFuelType() { return engineType; }

    @Override
    public String toString() {
        return super.toString() + " | Sidecar: " + hasSidecar + " | Engine: " + getFuelType();
    }
}
