package LLDesign.MovieBooking.NewMovieBooking;


import java.time.LocalDate;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private LocalDate createdOn;
    private String status;
    private Show show;
    private List<ShowSeat> seats;
    private double totalPrice;

    public Booking() {
    }

    public Booking(String bookingNumber, int numberOfSeats, String status, Show show, List<ShowSeat> seats,double totalPrice) {
        this.bookingNumber = bookingNumber;
        this.numberOfSeats = numberOfSeats;
        this.createdOn = LocalDate.now();
        this.status = status;
        this.show = show;
        this.seats = seats;
        this.totalPrice = totalPrice;
    }

    public void makePayment(Payment payment) {
        // Implementation for making payment

    }

    public void cancel() {
        // Implementation for cancelling the booking
    }

    public void assignSeats(List<ShowSeat> seats, Show show) {
        // Implementation for assigning seats to the booking
        for(ShowSeat selectedShowSeat: seats){
            for(ShowSeat showSeat : show.getCinemaHall().getSeats()){
                if(showSeat.getSeatRow()==selectedShowSeat.getSeatRow() && showSeat.getSeatColumn()==selectedShowSeat.getSeatColumn()){
                    showSeat.reserveSeat();
                    break;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber='" + bookingNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", createdOn=" + createdOn +
                ", status='" + status + '\'' +
                ", show=" + show +
                ", seats=" + seats +
                ", totalPrice=" + totalPrice +
                '}';
    }

    // Getters and setters
}
