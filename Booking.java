package LLDesign.MovieBooking;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private LocalDate createdOn;
    private String status;
    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    public Booking(String bookingNumber, int numberOfSeats, String status, Show show, List<ShowSeat> seats, Payment payment) {
        this.bookingNumber = bookingNumber;
        this.numberOfSeats = numberOfSeats;
        this.createdOn = LocalDate.now();
        this.status = status;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public void makePayment(Payment payment) {
        // Implementation for making payment

    }

    public void cancel() {
        // Implementation for cancelling the booking
    }

    public void assignSeats(List<ShowSeat> seats) {
        // Implementation for assigning seats to the booking
    }

    // Getters and setters
}
