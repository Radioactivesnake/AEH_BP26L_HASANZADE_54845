public class ConstructionEquipment extends Vehicle implements FuelType {
    private double hoursWorked;
    private String engineType;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color,
                                  double price, double fuelConsumption, double fuelLevel,
                                  double mileage, double hoursWorked, String engineType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.engineType = engineType;
    }

    public double getHoursWorked() { return hoursWorked; }

    public void work(double hours) {
        double fuelNeeded = fuelConsumption * hours;
        if (fuelNeeded > fuelLevel) {
            System.out.println(registrationNumber + ": Not enough fuel to work " + hours + " hours.");
        } else {
            fuelLevel -= fuelNeeded;
            hoursWorked += hours;
            System.out.println(registrationNumber + ": Worked " + hours
                    + " hours. Total hours: " + hoursWorked
                    + ". Fuel left: " + String.format("%.2f", fuelLevel) + "L.");
        }
    }

    @Override
    public String getFuelType() { return engineType; }

    @Override
    public String toString() {
        return super.toString() + " | Hours worked: " + hoursWorked + " | Engine: " + getFuelType();
    }
}
