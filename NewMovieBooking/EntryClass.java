package LLDesign.MovieBooking.NewMovieBooking;



import javax.sound.midi.SysexMessage;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntryClass {
    public static void main(String[] args) {
        Admin admin = new Admin("ABC","Gurgaon",new Account("abcUser","12345",AccountStatus.ACTIVE));
        Movie movie1 = new Movie("Avengers",180,"English",LocalDate.now(),"Bangalore");
        Movie movie2 = new Movie("Avengers End Game",200,"English",LocalDate.now().minusDays(2),"Bangalore");
        admin.addMovie(movie1);
        admin.addMovie(movie2);
//        Show show1Movie1 = new Show(1, LocalTime.now(),LocalTime.now().plusHours(2));
//        Show show2Movie1 = new Show(2, LocalTime.now().plusHours(3),LocalTime.now().plusHours(5));
//        Show show3Movie1 = new Show(3, LocalTime.now().plusHours(6),LocalTime.now().plusHours(8));
//        Show show1Movie2 = new Show(4, LocalTime.now(),LocalTime.now().plusHours(2));
//        Show show2Movie2 = new Show(5, LocalTime.now().plusHours(3),LocalTime.now().plusHours(5));
//        Show show3Movie2 = new Show(6, LocalTime.now().plusHours(6),LocalTime.now().plusHours(8));

        Show show1Movie1 = new Show("1", LocalTime.now(),LocalTime.now().plusHours(2),movie1);
        Show show2Movie1 = new Show("2", LocalTime.now().plusHours(3),LocalTime.now().plusHours(5),movie1);
        Show show3Movie1 = new Show("3", LocalTime.now().plusHours(6),LocalTime.now().plusHours(8),movie1);
        Show show1Movie2 = new Show("4", LocalTime.now(),LocalTime.now().plusHours(2),movie2);
        Show show2Movie2 = new Show("5", LocalTime.now().plusHours(3),LocalTime.now().plusHours(5),movie2);
        Show show3Movie2 = new Show("6", LocalTime.now().plusHours(6),LocalTime.now().plusHours(8),movie2);

        List<ShowSeat> showSeatList = new ArrayList<>();
        for(int i=1;i<5;i++){
            int price=1000;
            for(int j=1;j<5;j++){
                SeatType seatType=null;
                if(i==1 || i==2){//row1 and row2 from Bottom i.e more near to the screen
                     seatType = SeatType.REGULAR;
                }else if(i==3){//row3 from Bottom i.e i.e more near to the top
                    seatType = SeatType.ACCESSIBLE;
                    price=2000;
                }else if(i==4){//row4 from Bottom i.e topmost
                    seatType = SeatType.PREMIUM;
                    price=3000;
                }

                ShowSeat showSeat = new ShowSeat(i,j,seatType,price);
                //CinemaHallSeat cinemaHallSeat = new CinemaHallSeat(i,j,seatType);
                showSeatList.add(showSeat);
            }
        }
        CinemaHall cinemaHall1 = new CinemaHall("Screen1",showSeatList);
        cinemaHall1.addShow(show1Movie1);
        cinemaHall1.addShow(show2Movie1);
        cinemaHall1.addShow(show3Movie1);
        CinemaHall cinemaHall2 = new CinemaHall("Screen2",showSeatList);
        cinemaHall2.addShow(show1Movie2);
        cinemaHall2.addShow(show2Movie2);
        cinemaHall2.addShow(show3Movie2);
        Cinema cinema = new Cinema("PVR Bangalore","Bangalore");
        cinema.addCinemaHalls(cinemaHall1);
        cinema.addCinemaHalls(cinemaHall2);



        admin.addShow(show1Movie1);
        admin.addShow(show2Movie1);
        admin.addShow(show3Movie1);
        admin.addShow(show1Movie2);
        admin.addShow(show2Movie2);
        admin.addShow(show3Movie2);

        show1Movie1.setCinemaHall(cinemaHall1);
        show2Movie1.setCinemaHall(cinemaHall1);
        show3Movie1.setCinemaHall(cinemaHall1);
        show1Movie2.setCinemaHall(cinemaHall2);
        show2Movie2.setCinemaHall(cinemaHall2);
        show3Movie2.setCinemaHall(cinemaHall2);

        Customer customer = new Customer();
        customer.getMovieList();
        customer.getShowList();
        String showId = customer.promptCustomerForShowId();
        customer.makePayments(showId);


    }






}
