package LLDesign.MovieBooking;

import java.util.HashMap;
import java.util.Map;


/***
 * In this Java implementation, the Search interface defines the search methods, and the Catalog class implements this interface.
 * The Catalog class maintains several HashMap data structures to store movies based on their titles, languages, genres, release dates, and cities.
 * The Catalog class overrides the search methods defined in the Search interface and performs the search operations accordingly.
 * Please note that the actual search operations are not implemented and are indicated with a comment.
 * You can add the necessary logic to perform the search based on your requirements.
 * Make sure to implement the Movie class and any other related classes that are not included in the given code snippet.
 *
 *
 *
 *
 *
 * Regenerate response
 */
public interface Search {
    void searchByTitle(String title);
    void searchByLanguage(String language);
    void searchByGenre(String genre);
    void searchByReleaseDate(String releaseDate);
    void searchByCity(String cityName);

}

