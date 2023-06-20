package LLDesign.MovieBooking.NewMovieBooking;

import LLDesign.MovieBooking.InMemoryMovieRepository;
import LLDesign.MovieBooking.Movie;
import LLDesign.MovieBooking.MovieRepository;

import java.util.List;

public class City {
    private String name;
    private String state;
    private String zipCode;
    List<Cinema> cinemaList;
    private MovieRepository movieRepository;

    public City(String name, String state, String zipCode) {
        this.name = name;
        this.state = state;
        this.zipCode = zipCode;
        movieRepository= InMemoryMovieRepository.getInstance();


    }

    // Getters and setters

    public void addMovie(LLDesign.MovieBooking.Movie movie){
        movieRepository.addMovie(movie);
    }

//    public void setMovieList(Movie movie) {
//        movieList = movieRepository.searchByCity(movie.getCity());
//    }
}
