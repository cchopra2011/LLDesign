package LLDesign.MovieBooking.NewMovieBooking;


import LLDesign.MovieBooking.NewMovieBooking.*;

public class Admin extends Person {
    MovieRepository movieRepository;
    public Admin(String name, String address, Account account) {
        super(name, address, account);
        this.movieRepository= InMemoryMovieRepository.getInstance();
        /**This can be implemented in a new DatabaseProvider class*/
    }


    public void addMovie(Movie movie) {
        // Add a movie
        movieRepository.addMovie(movie);
    }

    public void addShow(Show show) {
        // Add a show
        movieRepository.addShow(show);
    }

//    public void blockUser(Customer customer) {
//        // Block a customer user
//    }
}

