package LLDesign.MovieBooking;

public class FrontDeskOfficer extends Person {
    public FrontDeskOfficer(String name, String address, String email, String phone, Account account) {
        super(name, address, account);
    }

    public void createBooking(Booking booking) {
        // Create a booking
    }
}
