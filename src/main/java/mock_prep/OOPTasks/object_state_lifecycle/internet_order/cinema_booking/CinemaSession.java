package mock_prep.OOPTasks.object_state_lifecycle.internet_order.cinema_booking;

import java.util.HashSet;
import java.util.Set;

public class CinemaSession {
    private String movieTitle;
    private int totalSeats;
    private Set<Integer> reservedSeats;

    public CinemaSession(String movieTitle, int totalSeats) {
        this.movieTitle = movieTitle;
        this.totalSeats = totalSeats;
        reservedSeats = new HashSet<>();
    }

    public void reserveSeat(int seatNumber){
        reservedSeats.add(seatNumber);
    }

    public void cancelReservation(int seatNumber){
        reservedSeats.remove(seatNumber);
    }

    public boolean isSeatReserved(int seatNumber){
        return reservedSeats.contains(seatNumber);
    }

    public int getFreeSeatsCount(){
        return totalSeats - reservedSeats.size();
    }
}
