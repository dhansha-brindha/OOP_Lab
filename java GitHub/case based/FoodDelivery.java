import java.util.Scanner;

class FoodOrder {

    String customerName;
    String foodItem;
    double price;

    void placeOrder(String name, String food, double p) {
        customerName = name;
        foodItem = food;
        price = p;
    }

    void displayOrder() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: " + price);
        System.out.println("Order Placed Successfully!");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodOrder f = new FoodOrder();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Food Item: ");
        String food = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        f.placeOrder(name, food, price);
        f.displayOrder();
    }
}