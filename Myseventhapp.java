package pl.pp;

import pl.pp.Person;

public class mySeventhApp {
    public static void main(String[] args) {

        // Create object person1 with default constructor, then set fields manually
        Person person1 = new Person();
        person1.hiToAll(); // fields are empty/zero by default

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.address = "123 Main Street, Warsaw";
        person1.year_of_birth = 2001;
        person1.hiToAll(); // now displays all fields including address and year_of_birth

        // Initialize person2 using the constructor with all five parameters
        Person person2 = new Person("Alice", "Hart", 42, "456 Oak Avenue, Krakow", 1983);
        person2.hiToAll();

        // Task 2 - growOld() now takes an argument
        // grow person1 older by 5 years, and person2 older by 10 years
        person1.growOld(5);
        person2.growOld(10);

        System.out.println("\nAfter growOld():");
        person1.hiToAll();
        person2.hiToAll();

        // Task 2 - beYounger() decreases age by 1 each time it is called
        // call beYounger() 3 times for person1
        for (int i = 0; i < 3; i++) {
            person1.beYounger();
        }

        System.out.println("\nAfter beYounger() x3 for person1:");
        person1.hiToAll();

        // getName and setName still work as before
        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}
