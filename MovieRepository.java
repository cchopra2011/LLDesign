package LLDesign.MovieBooking;

import java.util.List;
import java.util.Map;

public interface MovieRepository {

    void addShow(Movie movie,Show show);
    void addMovie(Movie movie);
//    void searchByTitle(String title);
//    void searchByLanguage(String language);
//    void searchByGenre(String genre);
//    void searchByReleaseDate(String releaseDate);
      List<Movie> searchByCity(String cityName);

}
