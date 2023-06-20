package LLDesign.MovieBooking.NewMovieBooking;


import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private int totalCinemaHalls;
    //private Address location;

    private String city;
    private List<CinemaHall> halls;

    public Cinema(String name, String city) {
        this.name = name;
        this.city = city;
        this.halls =  new ArrayList<>();
        //this.halls = halls;
        /**it is not correct to tightly couple list of cinema halls to a a cinema
         * rather it should be flexible i.e .cinema halls  can be added to or removed from a cinema
         * */
    }

    public void addCinemaHalls(CinemaHall cinemaHall){
        this.totalCinemaHalls+=1;
        halls.add(cinemaHall);
    }

    // Getters and setters
}
