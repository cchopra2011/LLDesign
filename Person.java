package LLDesign.MovieBooking;

public abstract class Person {
    private String name;
    private String address;
    private Account account;

    public Person(String name, String address, Account account) {
        this.name = name;
        this.address = address;
        this.account = account;
    }

    // Getters and setters


    public String getName() {
        return name;
    }
}

