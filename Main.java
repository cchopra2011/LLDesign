package LLDesign.MovieBooking;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        City  city1 = new City("Bangalore","Karnataka","122001");
        Account account = new Account("1","Root123",AccountStatus.ACTIVE);
        Admin admin= new Admin("Chetan","Gurgaon",account);
        Movie movie1 = new Movie("Avengers","Marvel Studios",175,"English", LocalDate.now(),"Bangalore","Sci-fi",admin.getName());
        admin.addMovie(movie1);
        city1.setMovieList(movie1);
        admin.addShow(movie1,new Show(1, "123",movie1, LocalTime.now(),LocalTime.now().plusHours(2)));
        admin.addShow(movie1,new Show(2, "124",movie1, LocalTime.now().plusHours(1),LocalTime.now().plusHours(3)));
        admin.addShow(movie1,new Show(3, "125",movie1, LocalTime.now().plusHours(2),LocalTime.now().plusHours(4)));
        Movie movie2 = new Movie("Avengers End Game","Marvel Studios",185,"English", LocalDate.now(),"Bangalore","Sci-fi",admin.getName());
        admin.addMovie(movie2);
        city1.setMovieList(movie2);
        admin.addShow(movie2,new Show(1, "123",movie2, LocalTime.now(),LocalTime.now().plusHours(2)));
        admin.addShow(movie2,new Show(2, "124",movie2, LocalTime.now().plusHours(1),LocalTime.now().plusHours(3)));
        admin.addShow(movie2,new Show(3, "125",movie2, LocalTime.now().plusHours(2),LocalTime.now().plusHours(4)));
    }
}
