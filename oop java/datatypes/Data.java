package datatypes;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter invoice ID: ");
        int invoice_ID = sc.nextInt();

        System.out.print("Enter product ID: ");
        int product_ID = sc.nextInt();

        System.out.print("Enter product cost: ");
        double product_cost = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount: ");
        double discount = sc.nextDouble();

        System.out.print("Enter total price: ");
        double total_price = sc.nextDouble();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter customer name: ");
        String customer_name = sc.nextLine();

        System.out.println("\n--- Invoice Details ---");
        System.out.println("Invoice ID: " + invoice_ID);
        System.out.println("Product ID: " + product_ID);
        System.out.println("Product Cost: " + product_cost);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("Total Price: " + total_price);
        System.out.println("Customer Name: " + customer_name);
    }
}
