package pl.pp;

public class myNinthApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("W-001", 5000, "Jan Kowalski", "jan@magazyn.pl", "+48 000 000 000");

        warehouse.addGoods(3000);       // Added 3000, remaining: 2000
        warehouse.removeGoods(1000);    // Removed 1000, remaining: 3000
        warehouse.addGoods(2500);       // Added 2500, remaining: 500
        warehouse.checkOccupancy();     // Occupied: 4500, Available: 500
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(1000);       // Not enough space
    }
}
