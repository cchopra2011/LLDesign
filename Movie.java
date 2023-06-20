package LLDesign.MovieBooking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String description;
    private int durationInMinutes;
    private String language;
    private LocalDate releaseDate;
    private String city;
    private String genre;
    private String movieAddedBy;
    private List<Show> shows;

    public Movie(String title, String description, int durationInMinutes, String language, LocalDate releaseDate,
                 String country, String genre, String addedBy) {
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
        this.language = language;
        this.releaseDate = releaseDate;
        this.city = country;
        this.genre = genre;
        this.movieAddedBy = addedBy;
        this.shows = new ArrayList<>();
    }

    public List<Show> getShows() {
        return shows;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getCity() {
        return city;
    }

    public String getGenre() {
        return genre;
    }

    public String getMovieAddedBy() {
        return movieAddedBy;
    }


    // Getters and setters
}
