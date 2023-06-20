package LLDesign.MovieBooking;

import java.util.List;

public class Cinema {
    private String name;
    private int totalCinemaHalls;
    private Address location;
    private List<CinemaHall> halls;

    public Cinema(String name, int totalCinemaHalls, Address location, List<CinemaHall> halls) {
        this.name = name;
        this.totalCinemaHalls = totalCinemaHalls;
        this.location = location;
        this.halls = halls;
    }

    // Getters and setters
}
