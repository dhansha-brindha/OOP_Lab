import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for total seats at the start
        System.out.print("Enter total number of seats available: ");
        int totalSeats = sc.nextInt();
        int availableSeats = totalSeats;
        int userTickets = 0;
        int choice;

        while (true) {
            System.out.println("\n------------------------------");
            System.out.println("🎟 Ticket Booking System");
            System.out.println("------------------------------");
            System.out.println("Available Seats: " + availableSeats);
            System.out.println("\nMenu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // BOOK TICKET
                    if (availableSeats == 0) {
                        System.out.println("❌ No seats available for booking!");
                        break;
                    }

                    System.out.print("How many tickets do you want to book? ");
                    int toBook = sc.nextInt();

                    if (toBook <= 0) {
                        System.out.println("❌ Invalid number of tickets!");
                    } else if (toBook > availableSeats) {
                        System.out.println("⚠️ Only " + availableSeats + " seats are available!");
                    } else {
                        System.out.print("Confirm booking of " + toBook + " tickets? (yes/no): ");
                        String confirm = sc.next().toLowerCase();

                        if (confirm.equals("yes")) {
                            availableSeats -= toBook;
                            userTickets += toBook;
                            System.out.println("✅ Successfully booked " + toBook + " ticket(s).");
                            System.out.println("🎫 Your total booked tickets: " + userTickets);
                            System.out.println("💺 Seats remaining: " + availableSeats);
                        } else {
                            System.out.println("Booking cancelled.");
                        }
                    }
                    break;

                case 2:
                    // CANCEL TICKET
                    if (userTickets == 0) {
                        System.out.println("❌ You have no tickets to cancel!");
                        break;
                    }

                    System.out.print("How many tickets do you want to cancel? ");
                    int toCancel = sc.nextInt();

                    if (toCancel <= 0) {
                        System.out.println("❌ Invalid number!");
                    } else if (toCancel > userTickets) {
                        System.out.println("⚠️ You only have " + userTickets + " tickets booked!");
                    } else {
                        userTickets -= toCancel;
                        availableSeats += toCancel;
                        System.out.println("✅ Cancelled " + toCancel + " ticket(s).");
                        System.out.println("🎫 Your current tickets: " + userTickets);
                        System.out.println("💺 Seats remaining: " + availableSeats);
                    }
                    break;

                case 3:
                    // CHECK STATUS
                    System.out.println("\n📊 Status Report:");
                    System.out.println("Total Seats: " + totalSeats);
                    System.out.println("Seats Available: " + availableSeats);
                    System.out.println("Your Tickets: " + userTickets);
                    break;

                case 4:
                    // EXIT
                    System.out.println("👋 Thank you for using the Ticket Booking System!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}
