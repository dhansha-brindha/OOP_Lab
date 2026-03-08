class BankAccount{
int balance;
BankAccount(int balance){
this.balance=balance;
}
}
class SavingsAccount extends BankAccount{

SavingsAccount(int balance){
super(balance);
}

void Calcinterest(){
System.out.println("Amount of interest = " + (balance*0.05));
}
}

public class Q5{
public static void main(String[] args){
SavingsAccount s = new SavingsAccount(1500);
s.Calcinterest();
}
}
