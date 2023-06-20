package LLDesign.MovieBooking;

import LLDesign.ParkingLot.ParkingLot;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InMemoryMovieRepository implements MovieRepository {

    private static InMemoryMovieRepository instance;

    private static Lock lock = new ReentrantLock();
    private Map<String, Movie> movieTitles;
    private Map<String, Movie> movieLanguages;
    private Map<String, Movie> movieGenres;
    private Map<String, Movie> movieReleaseDates;
    private Map<String, List<Movie>> movieCities;

    private InMemoryMovieRepository() {
        movieTitles = new HashMap<>();
        movieLanguages = new HashMap<>();
        movieGenres = new HashMap<>();
        movieReleaseDates = new HashMap<>();
        movieCities = new HashMap<>();
    }

    public static InMemoryMovieRepository getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new InMemoryMovieRepository();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    @Override
    public void addShow(Movie movie, Show show) {
        movie.getShows().add(show);
    }
    @Override
    public void addMovie(Movie movie) {
        addMovieByTitle(movie);
        addMovieByCity(movie);
        addMovieByGenre(movie);
        addMovieByLanguage(movie);
        addMovieByReleaseDate(movie);
    }


    public void addMovieByTitle(Movie movie) {
        movieTitles.put(movie.getTitle(),movie);
    }


    public Movie searchByTitle(String title) {
        Movie movie = movieTitles.get(title);
        return  movie;
        // Perform search operation with the movie
    }

    public void addMovieByLanguage(Movie movie) {
        movieLanguages.put(movie.getLanguage(),movie);
    }


    public Movie searchByLanguage(String language) {
        Movie movie = movieLanguages.get(language);
        return movie;
        // Perform search operation with the movie
    }


    public void addMovieByGenre(Movie movie) {
        movieGenres.put(movie.getGenre(),movie);
    }


    public Movie searchByGenre(String genre) {
        Movie movie = movieGenres.get(genre);
        return movie;
        // Perform search operation with the movie
    }


    public void addMovieByReleaseDate(Movie movie) {
        movieReleaseDates.put(String.valueOf(movie.getReleaseDate()),movie);
    }


    public Movie searchByReleaseDate(String releaseDate) {
        Movie movie = movieReleaseDates.get(releaseDate);
        return movie;
        // Perform search operation with the movie
    }


    public void addMovieByCity(Movie movie) {
        List<Movie> movieList = movieCities.get(movie.getCity());
        List<Movie> existMovieList;
        if(movieList!=null){
            existMovieList= new ArrayList<>(movieList);
            existMovieList.add(movie);
            movieCities.put(movie.getCity(),existMovieList);
        }else{
            movieCities.put(movie.getCity(), Arrays.asList(movie));
        }
    }


    public List<Movie> searchByCity(String cityName) {
        List<Movie> movie = movieCities.get(cityName);
        return movie;
        // Perform search operation with the movie
    }
}
