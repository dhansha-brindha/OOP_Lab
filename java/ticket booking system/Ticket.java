import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total number of seats available : ");
        int totalseats = sc.nextInt();
        int availableseats = totalseats;
        int userticket = 0;
        int choice;
        int canc;

        while (true){
            System.out.println("\n----------");
            System.out.println("ticket booking system");
            System.out.println("\n----------");
            System.out.println("available number of seats = " + availableseats);
            System.out.println("\nmenu:");
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. check status");
            System.out.println("4. exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

        switch(choice){
            case 1: //book
                if (availableseats==0){
                    System.out.println("seats not available");
                    break;
                }
                System.out.print("enter the number of seats you want to book");
                int tobook = sc.nextInt();

                if (tobook>availableseats){
                    System.out.println("these many seats not available");
                } else if(tobook<=availableseats){
                    System.out.println("sure about booking these ticket");
                    sc.nextLine();
                    String confirm=sc.nextLine().toLowerCase();
                    if (confirm.equalsIgnoreCase("yes")){
                        userticket+=tobook;
                        availableseats-=tobook;
                        System.out.println("your ticket has been sucessfully booked");
                        System.out.println("-----Ticket Status-----");
                        System.out.println("you have booked " + userticket);
                        System.out.println("total seat available " + availableseats);
                    } else{
                        System.out.println("your booking has been rejected");
                    }
                }
                break;
            case 2: //cancel 
            if (userticket==0){
                System.out.println("error you havent booked any tickets");
                break;
            }
            System.out.println("how many tickets you want to cancel");
            canc = sc.nextInt();
            System.out.println("are you sure about ticket cancellation? (yes/no)?");
            sc.nextLine();
            String con = sc.nextLine().toLowerCase();
            if (con.equalsIgnoreCase("yes")){
                userticket-=canc;
                availableseats+=canc;
                System.out.println("your ticket has been cancelled sucesfully");
                System.out.println("-----Ticket Status-----");
                System.out.println("you have booked " + userticket);
                System.out.println("total seat available " + availableseats);
            }
            else{
                System.out.println("thankyou for booking ticket with us. Do you need any help?");
            }
            break;
            case 3:
                System.out.println("-----Ticket Status-----");
                System.out.println("you have booked " + userticket);
                System.out.println("total seat available " + availableseats);
            break;
            case 4:
                System.out.println("👋 Thank you for using the Ticket Booking System!");
                    sc.close();
                    System.exit(0);
                    break;
            default:
                System.out.println("invalid");


        }

    }
}
}
