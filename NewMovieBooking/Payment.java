package LLDesign.MovieBooking.NewMovieBooking;


import java.time.LocalDate;
import java.util.UUID;

public class Payment {
    private double amount;
    private LocalDate createdOn;
    private String transactionId;
    private String status;
    private String showId;

    public Payment(double amount, String status,String showId) {
        this.amount = amount;
        this.createdOn = LocalDate.now();
        this.transactionId = UUID.randomUUID().toString();
        this.status = status;
        this.showId = showId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getStatus() {
        return status;
    }

    public String getShowId() {
        return showId;
    }

    //
//    // Getters and setters
}
