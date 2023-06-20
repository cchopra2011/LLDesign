package LLDesign.MovieBooking.NewMovieBooking;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int durationInMinutes;
    private String language;
    private LocalDate releaseDate;
    private String city;
    //private List<Show> shows;

    public Movie(String title,  int durationInMinutes, String language, LocalDate releaseDate,
                 String city) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.language = language;
        this.releaseDate = releaseDate;
        this.city = city;
        //this.shows = new ArrayList<>();
    }

//    public List<Show> getShows() {
//        return shows;
//    }

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

    @Override
    public String toString() {
        return "Movie{" +
                "\n title='" + title + '\'' +
                '}';
    }

// Getters and setters
}
