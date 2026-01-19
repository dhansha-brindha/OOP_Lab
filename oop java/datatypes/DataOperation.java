package datatypes;
public class DataOperation {
    public static void main (String args[]){
    int itema=200,itemb=300,itemc=400;
    double price = itema+itemb+itemc;
    price = price-(0.1*price);
    price = price + (0.05*price);
    System.out.println(price);
    }
}
