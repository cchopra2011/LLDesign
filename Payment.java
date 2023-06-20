package LLDesign.MovieBooking;


import java.time.LocalDate;
import java.util.UUID;

public class Payment {
    private double amount;
    private LocalDate createdOn;
    private String transactionId;
    private String status;

    public Payment(double amount, String status) {
        this.amount = amount;
        this.createdOn = LocalDate.now();
        this.transactionId = UUID.randomUUID().toString();
        this.status = status;
    }
//
//    // Getters and setters
}
