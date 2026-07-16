package mock_prep.OOPTasks.object_state_lifecycle.internet_order.cinema_booking;

public class Main {
    static void main(String[] args) {
        CinemaSession cinemaSession = new CinemaSession("The Odyssey", 50);
        cinemaSession.reserveSeat(5);
        cinemaSession.reserveSeat(6);
        cinemaSession.reserveSeat(3);
        cinemaSession.reserveSeat(2);
        System.out.println(cinemaSession.getFreeSeatsCount());
        System.out.println();

        System.out.println(cinemaSession.isSeatReserved(5));

        cinemaSession.cancelReservation(5);
        System.out.println(cinemaSession.getFreeSeatsCount());
        System.out.println();
    }
}
