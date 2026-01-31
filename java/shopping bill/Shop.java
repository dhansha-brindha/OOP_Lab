import java.util.Scanner;

public class Shop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of products");
        int n = sc.nextInt();
        double total = 0;
        sc.nextLine();
        System.out.println("-----BILL-----");
        System.out.println("Item\tPrice\tTotal");
        for (int i = 0; i<=n; i++){
            System.out.println("enter the item name");
            String item = sc.nextLine();
            System.out.println("enter the price of the item");
            double price = sc.nextDouble();
            System.out.println("enter the number of item");
            int a = sc.nextInt();
            sc.nextLine();
            double pricetotal= price*a;
            total +=pricetotal;

            System.out.println(item + "\t"+ price + " \t " + pricetotal);
        }
        System.out.println("----------");
        System.out.println("\nfinal bill = "+ total);
        sc.close();
    }
    
}
