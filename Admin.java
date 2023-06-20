package LLDesign.MovieBooking;

public class Admin extends Person {
    MovieRepository movieRepository;
    public Admin(String name, String address,  Account account) {
        super(name, address, account);
        this.movieRepository= InMemoryMovieRepository.getInstance();
    }


    public void addMovie(Movie movie) {
        // Add a movie
        movieRepository.addMovie(movie);
    }

    public void addShow(Movie movie,Show show) {
        // Add a show
        movieRepository.addShow(movie,show);
    }

//    public void blockUser(Customer customer) {
//        // Block a customer user
//    }
}

