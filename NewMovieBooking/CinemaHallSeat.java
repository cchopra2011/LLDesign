package LLDesign.MovieBooking.NewMovieBooking;


public class CinemaHallSeat {
    private int seatRow;
    private int seatColumn;
    private SeatType seatType;

    public CinemaHallSeat(int seatRow, int seatColumn ,SeatType seatType) {
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.seatType = seatType;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public int getSeatColumn() {
        return seatColumn;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    // Getters and setters
}

