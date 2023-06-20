package LLDesign.MovieBooking;

public class ShowSeat extends CinemaHallSeat {
    private boolean isReserved;
    private double price;

    public ShowSeat(int seatRow, int seatCol, SeatType seatType) {
        super(seatRow,seatCol,seatType);
        this.isReserved = isReserved;
        this.price = price;
    }

    // Getters and setters
}

