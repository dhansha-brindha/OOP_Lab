class Parent{
Parent(){
System.out.println("parent constructor called");
}
}
class Child extends Parent{
Child(){
System.out.println("Child constructor called");
}
}
public class Q6{
public static void main(String[] args){
Child c = new Child();
}
}