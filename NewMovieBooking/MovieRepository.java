package LLDesign.MovieBooking.NewMovieBooking;



import java.util.List;

public interface MovieRepository {

    void addShow(Show show);
    void addMovie(Movie movie);

    //    void searchByTitle(String title);
//    void searchByLanguage(String language);
//    void searchByGenre(String genre);
//    void searchByReleaseDate(String releaseDate);
      List<Movie> searchByCity(String cityName);
      List<Show> searchShowByMovie(String movieName);

}
