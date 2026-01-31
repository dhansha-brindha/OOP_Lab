import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    if (x>0){
        System.out.println("the number is positive");
    }
    else if (x<0) {
        System.out.println("the number is negative");
    }
    else{
        System.out.println("the number is 0");
    }
}
}
