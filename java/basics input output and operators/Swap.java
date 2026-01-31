import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=5,b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a=" + a + "b=" + b);
    }
}
