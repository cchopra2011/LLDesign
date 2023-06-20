package LLDesign.MovieBooking;


import java.time.LocalDate;
import java.time.LocalTime;

public class Show {
    private int showId;
    private LocalTime startTime;
    private LocalTime endTime;

    public Show(int showId, String playedAt, Movie movie, LocalTime startTime, LocalTime endTime) {
        this.showId = showId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and setters
}
