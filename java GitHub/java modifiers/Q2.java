class bank{
private double balance;

public void deposit(double amount){
balance = balance+amount;
}
public void display(){
System.out.println("Balance: "+balance);
}
}
public class Q2{
public static void main(String args[]){
bank b = new bank();
b.deposit(200.85);
b.display();
}
}