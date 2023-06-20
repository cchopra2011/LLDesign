package LLDesign.MovieBooking.NewMovieBooking;


import java.time.LocalTime;

public class Show {
    private String showId;
    private LocalTime startTime;
    private LocalTime endTime;
    private Movie movie;
    private CinemaHall cinemaHall;

    public Show(String showId, LocalTime startTime, LocalTime endTime,Movie movie) {
        this.showId = showId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public String getShowId() {
        return showId;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    @Override
    public String toString() {
        return "\n Show{" +
                "\n showId= " + showId +
                ", \n startTime= " + startTime +
                ", \n endTime= " + endTime +
                '}';
    }
    // Getters and setters
}
