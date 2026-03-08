import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String customerName, productName;
        double price, totalPrice, finalPrice;
        int quantity;
        float discount;
        char deliveryType;

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Discount Percentage: ");
        discount = sc.nextFloat();

        System.out.print("Enter Delivery Type (N/E): ");
        deliveryType = sc.next().charAt(0);

        totalPrice = price * quantity;

        double discountAmount = totalPrice * discount / 100;
        finalPrice = totalPrice - discountAmount;

        if(finalPrice > 5000) {
            finalPrice = finalPrice - (finalPrice * 0.05);
        }

        if(deliveryType == 'E') {
            finalPrice = finalPrice + 100;
        }

        System.out.println("\nShopping Bill");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Final Amount: " + finalPrice);
    }
}