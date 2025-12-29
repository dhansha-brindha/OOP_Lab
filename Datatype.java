import java.util.Scanner;
class Datatype{
	public static void main(String args[])
	{
	Scanner abc=new Scanner(System.in);
	System.out.println("enter invoice ID");
	int invoice = abc.nextInt();
	System.out.println("enter product ID");
	int product = abc.nextInt();
	System.out.println("enter product cost");
	double prd = abc.nextDouble();
	System.out.println("enter quantity");
	int quantity = abc.nextInt();
	System.out.println("enter discount");
	double discount = abc.nextDouble();
	System.out.println("enter total price");
	double price = abc.nextDouble();
	System.out.println("enter feedback provided (y/n)");
	boolean feedback = abc.nextBoolean();
	}
}
	