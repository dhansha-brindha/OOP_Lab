import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 7;
        int guess;

        while(true) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if(guess == secret) {
                System.out.println("Correct Guess!");
                break;
            }
            else {
                System.out.println("Try again");
            }

        }

    }
}