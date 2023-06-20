package LLDesign.MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Booking> bookings;

    public Customer(String name, String address, String email, String phone, Account account) {
        super(name, address, account);
        this.bookings = new ArrayList<>();
    }

    public void makeBooking(Booking booking) {
        // Make a booking
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
