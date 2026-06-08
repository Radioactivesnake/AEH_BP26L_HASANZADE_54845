package pl.pp;

public class myEighthApp {
    public static void main(String[] args) {
        Account account = new Account("123-456-789", 1000.0, "John Doe", "john@example.com", "555-1234");

        account.withdraw(900.0);   // Withdrew PLN 900.0, Remaining balance = PLN 100.0
        account.deposit(250.0);    // Deposit of PLN 250.0. New balance PLN 350.0
        account.withdraw(50.0);    // Withdrew PLN 50.0, Remaining balance = PLN 300.0
        account.withdraw(500.0);   // Insufficient funds. You have PLN 300.0
    }
}
