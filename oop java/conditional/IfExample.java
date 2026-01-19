package conditional;
import java.util.*;

public class IfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number entered is positive");
        } else if (num < 0) {
            System.out.println("The number entered is negative");
        } else {
            System.out.println("The number is 0");
        }

        sc.close();
    }
}

