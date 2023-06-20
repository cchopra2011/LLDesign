package LLDesign.MovieBooking;

import java.util.List;

public class CinemaHall {
    private String name;
    private int totalSeats;
    private List<CinemaHallSeat> seats;
    private List<Show> shows;

    public CinemaHall(String name, int totalSeats, List<CinemaHallSeat> seats, List<Show> shows) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.seats = seats;
        this.shows = shows;
    }

    // Getters and setters
}
