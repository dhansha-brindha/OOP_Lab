import java.util.Scanner;

public class Shop1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        double finalTotal = 0;

        System.out.println("\n-----BILL-----");
        System.out.println("Item\tPrice\tQty\tTotal");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            double itemTotal = price * qty;
            finalTotal += itemTotal;

            System.out.println(item + "\t" + price + "\t" + qty + "\t" + itemTotal);
        }

        System.out.println("----------------");
        System.out.println("Final bill = " + finalTotal);

        sc.close();
    }
}
