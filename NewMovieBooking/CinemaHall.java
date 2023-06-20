package LLDesign.MovieBooking.NewMovieBooking;


import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    private String name;
    private List<ShowSeat> seats;
    private List<Show> shows;

    public CinemaHall(String name, List<ShowSeat> seats) {
        this.name = name;
        this.seats = seats;
        this.shows = new ArrayList<>();
        //this.shows = shows;
        /**it is not correct to tightly couple list of shows to a a cinema hall
         * rather it should be flexible i.e shows can be added or removed from a cinema hall
         **/
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }

    public void addShow(Show show){
        shows.add(show);
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", shows=" + shows +
                '}';
    }


    // Getters and setters
}
