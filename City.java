package LLDesign.MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String state;
    private String zipCode;
    List<Movie> movieList;
    private MovieRepository movieRepository;

    public City(String name, String state, String zipCode) {
        this.name = name;
        this.state = state;
        this.zipCode = zipCode;
        movieRepository= InMemoryMovieRepository.getInstance();


    }

    // Getters and setters

    public void addMovie(Movie movie){
        movieRepository.addMovie(movie);
    }

    public void setMovieList(Movie movie) {
        movieList = movieRepository.searchByCity(movie.getCity());
    }
}
