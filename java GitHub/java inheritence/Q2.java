class Vehicle{
void start(){
System.out.println("Starting....");
}
}
class Bike extends Vehicle{
void riding(){
System.out.println("Riding....");
}
}
public class Q2{
public static void main(String[] args){
Bike b = new Bike();
b.start();
b.riding();
}
}

