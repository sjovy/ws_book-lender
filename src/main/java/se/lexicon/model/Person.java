package se.lexicon.model;

public class Person {
    // Fields:

    private static int sequencer = 0;

    private final int id;
    private String firstName;
    private String lastName;

    //Constructor
    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


// todo:  implement loanBook and returnBook

    public String getPersonInformation() {
        return "ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName;
    }
}