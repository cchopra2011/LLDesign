package LLDesign.MovieBooking.NewMovieBooking;



public class ShowSeat extends CinemaHallSeat {

    private boolean isReserved;
    private int price;

    public ShowSeat(int seatRow, int seatColumn, SeatType seatType, int price) {
        super(seatRow, seatColumn, seatType);
        this.isReserved = false;
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public int getPrice() {
        return price;
    }

    void reserveSeat(){
        this.isReserved=true;
    }

    @Override
    public String toString() {
        return "ShowSeat{" +
                "isReserved=" + isReserved +
                ", price=" + price +
                '}';
    }
}
