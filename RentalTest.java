public class RentalTest {
    public static void main(String[] args) {

        System.out.println("=== VEHICLE RENTAL SYSTEM TEST ===\n");

        PassengerCar sedan = new PassengerCar(
                "WA12345", "1HGBH41JXMN109186", "Red",
                85000, 7.5, 50, 0, 4, "gasoline");

        PassengerCar ev = new PassengerCar(
                "WA99999", "5YJSA1E26MF123456", "White",
                220000, 15, 75, 0, 4, "electric");

        Truck truck = new Truck(
                "KR55555", "3VWFE21C04M000001", "Blue",
                350000, 28, 200, 15000, 12.5, "diesel");

        Motorcycle moto = new Motorcycle(
                "GD77777", "SMTD00TL9FJ123456", "Black",
                45000, 4.2, 18, 500, false, "gasoline");

        ConstructionEquipment excavator = new ConstructionEquipment(
                "PO11111", "XCMG123456789", "Yellow",
                600000, 12, 100, 0, 0, "diesel");

        System.out.println("--- Fleet ---");
        System.out.println(sedan);
        System.out.println(ev);
        System.out.println(truck);
        System.out.println(moto);
        System.out.println(excavator);

        System.out.println("\n--- Driving tests ---");
        sedan.drive(200);
        sedan.drive(400);
        sedan.refuel(30);
        sedan.drive(400);

        System.out.println();
        ev.drive(300);
        ev.refuel(50);

        System.out.println();
        truck.drive(500);
        truck.refuel(100);

        System.out.println();
        moto.drive(100);
        moto.drive(500);

        System.out.println("\n--- Construction equipment ---");
        excavator.work(5);
        excavator.refuel(50);
        excavator.work(8);

        System.out.println("\n--- Fuel types (polymorphism) ---");
        FuelType[] engines = {
            new DieselEngine(),
            new GasolineEngine(),
            new ElectricEngine()
        };
        for (FuelType e : engines) {
            System.out.println("Engine type: " + e.getFuelType());
        }

        System.out.println("\n--- All vehicles via Vehicle[] ---");
        Vehicle[] fleet = { sedan, ev, truck, moto, excavator };
        for (Vehicle v : fleet) {
            System.out.println(v + " | Fuel type: " + ((FuelType) v).getFuelType());
        }
    }
}
