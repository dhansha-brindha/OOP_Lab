class Animal{
void sound(){
System.out.println("animal makes sound");
}
}
class dog extends Animal{
void sound(){
System.out.println("Dog barks");
}
}
public class Q9{
public static void main(String[] args){
dog d = new dog();
d.sound();
}
}