package LLDesign.MovieBooking.NewMovieBooking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Customer {

    InMemoryMovieRepository movieRepository = InMemoryMovieRepository.getInstance();

    private Booking booking = new Booking();


    //Entities : admin,customer(registered),FrontDeskOfficer,movie,cinema,show,seat ,payment,booking

    public List<Movie> getMovieList(){
        Set<String> citySet = movieRepository.getCityList();
        System.out.println(citySet);
        String city = promptForCity();
        return movieRepository.searchByCity(city);
    }

    private String promptForCity() {
        System.out.println("Please Enter the city name :: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<Show> getShowList(){
        Set<String> movieTitlesSet = movieRepository.getMovieTitles();
        System.out.println(movieTitlesSet);
        String movieName = promptForMovieTitle();
        List<Show> showList = movieRepository.searchShowByMovie(movieName);
        System.out.println(showList);
        return showList;
    }

    private String promptForMovieTitle() {
        System.out.println("Please Enter the Movie name :: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }



    private List<ShowSeat> promptCustomerForSeatSelection(Show show) {
        List<ShowSeat> selectedShowSeatList = new ArrayList<>();
        List<ShowSeat> showSeatList = show.getCinemaHall().getSeats();
        System.out.println("Select Seat Map....");
        for (ShowSeat showSeat : showSeatList){
            if(!showSeat.isReserved()) {
                System.out.println(" Seat No : " + showSeat.getSeatRow() + "-" + showSeat.getSeatColumn() +" Price : "+showSeat.getPrice() + "  Seat Type :  "+showSeat.getSeatType().name());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of seats ....");
        int selectNoOfSeats = scanner.nextInt();
        System.out.println("Enter the seat no for Selection ....");
        for(int i=1;i<=selectNoOfSeats;i++){
            System.out.println("Enter the row no for Selection ....");
            int rowNum = scanner.nextInt();
            System.out.println("Enter the col no for Selection ....");
            int colNum = scanner.nextInt();
            ShowSeat showSeat = showSeatList.stream().filter(showSeat1 -> showSeat1.getSeatRow()==rowNum && showSeat1.getSeatColumn()==colNum).findFirst().get();
            selectedShowSeatList.add(showSeat);
        }
        return selectedShowSeatList;
    }

    public  String promptCustomerForShowId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the showId for Movie Booking ....");
        String showId = scanner.nextLine();
        return showId;
    }

    void makePayments(String showId){
        List<Show> showList = getShowList();
        Show show = getShowById(showId,showList);
        List<ShowSeat> selectedShowSeats = promptCustomerForSeatSelection(show);
        double totalPrice = selectedShowSeats.stream().mapToDouble(value -> value.getPrice()).sum();
        promoptCustomerForCardDetails();
        makePayment(totalPrice,PaymentStatus.COMPLETED.toString(),showId,selectedShowSeats,show);
    }

    private void promoptCustomerForCardDetails() {
    }

    private static Show getShowById(String showID,List<Show> showList) {
        Show show = showList.stream().filter(show1 -> show1.getShowId().equalsIgnoreCase(showID)).findFirst().get();
        return show;
    }

    private void makePayment(double totalPrice, String string, String showID, List<ShowSeat> selectedShowSeats, Show show){
        Payment payment = new Payment(totalPrice,PaymentStatus.COMPLETED.toString(),showID);
        if(payment.getStatus().equalsIgnoreCase(PaymentStatus.COMPLETED.toString())){
            Booking booking = makeBooking(selectedShowSeats,show,totalPrice);
            System.out.println("Booking Successful ..!!");
            System.out.println("Booking Details :  "+booking);
        }
    }

    private Booking makeBooking(List<ShowSeat> selectedShoeSeats, Show show, double totalPrice) {
        booking.assignSeats(selectedShoeSeats,show);
        Booking booking1 = new Booking("101",selectedShoeSeats.size(),"Confirmed",show,selectedShoeSeats,totalPrice);
        return booking1;
    }


}
