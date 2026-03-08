class Bird{
void fly(){
System.out.println("bird flies");
}
}
class Sparrow extends Bird{
void chirip(){
System.out.println("Sparrow chirips");
}
}
public class Q10{
public static void main(String[] args){
Sparrow s = new Sparrow();
s.chirip();
s.fly();
}
}