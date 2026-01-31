import java.util.Scanner;
public class Add_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter a number");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("sum of the numbers is" + sum);
    }
    
}
