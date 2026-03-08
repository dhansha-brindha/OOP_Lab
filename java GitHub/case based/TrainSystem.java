import java.util.Scanner;

class TrainBooking {
    String passengerName;
    String trainName;
    int seatNo;

    void bookTicket(String name, String train, int seat) {
        passengerName = name;
        trainName = train;
        seatNo = seat;
    }

    void displayTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Name: " + trainName);
        System.out.println("Seat Number: " + seatNo);
        System.out.println("Ticket Booked Successfully!");
    }
}

public class TrainSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainBooking t = new TrainBooking();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Train Name: ");
        String train = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        t.bookTicket(name, train, seat);
        t.displayTicket();
    }
}