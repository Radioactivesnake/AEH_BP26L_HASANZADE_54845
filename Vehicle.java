public abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color,
                   double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public void drive(double kilometers) {
        double fuelNeeded = (fuelConsumption / 100) * kilometers;
        if (fuelNeeded > fuelLevel) {
            System.out.println(registrationNumber + ": Not enough fuel! Need "
                    + fuelNeeded + "L but only have " + fuelLevel + "L.");
        } else {
            fuelLevel -= fuelNeeded;
            mileage += kilometers;
            System.out.println(registrationNumber + ": Drove " + kilometers
                    + " km. Fuel remaining: " + String.format("%.2f", fuelLevel)
                    + "L. Total mileage: " + mileage + " km.");
        }
    }

    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println(registrationNumber + ": Refueled " + liters
                + "L. New fuel level: " + fuelLevel + "L.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + registrationNumber + "] "
                + color + " | Price: " + price + " PLN | Mileage: " + mileage + " km";
    }
}
