import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int b = sc.nextInt();
        int Largest = (a>b) ? a:b ;
        System.out.println("largest is " + Largest);
    }
    
}
