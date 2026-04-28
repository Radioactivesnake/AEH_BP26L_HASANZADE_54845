package pl.pp;

public class Person {
    // fields (attributes) of the class defining the object "Person" (its parameters/characteristics)
    public String forename;       // field storing the feature forename
    public String surname;        // field storing the feature surname
    public int age;               // field storing the feature age
    public String address;        // field storing the address of the person (Task 2 - new field)
    public int year_of_birth;     // field storing the year of birth of the person (Task 2 - new field)

    /**
     * Default constructor - an element initializing object fields during its creation
     * (if we do not provide any parameters ourselves)
     */
    public Person() {

    }

    /**
     * Constructor with five parameters, which we can provide at its creation
     */
    public Person(String initForename, String initSurname, int initAge, String initAddress, int initYearOfBirth) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        year_of_birth = initYearOfBirth;
    }

    // class methods defining actions possible to be performed by the object
    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". "
                + "I am " + age + " years old. "
                + "I live at: " + address + ". "
                + "I was born in: " + year_of_birth + ".");
    }

    // Task 2 - modified growOld() method that takes an argument and increases age by that value
    public int growOld(int years) {
        age = age + years;
        return age;
    }

    // Task 2 - new beYounger() method that decreases age by 1 each time it is called
    public int beYounger() {
        age = age - 1;
        return age;
    }

    // example method getName returning the value of forename of the object
    public String getName() {
        return forename;
    }

    // example method setName setting the value of forename of the object
    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}
