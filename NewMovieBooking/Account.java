package LLDesign.MovieBooking.NewMovieBooking;


public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public Account(String id, String password, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public void resetPassword() {
        // Reset the account password
    }

    // Getters and setters
}
