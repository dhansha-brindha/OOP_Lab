import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in degree celsius");
        int celsius = sc.nextInt();
        int fahrenheit = (9/5 * celsius) + 32;
        System.out.println("fahrenheit = " + fahrenheit);
    }
    
}
