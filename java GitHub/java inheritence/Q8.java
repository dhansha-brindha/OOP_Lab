class parent{
void show(){
System.out.println("parent method");
}
}
class child extends parent{
void show(){
super.show();
System.out.println("child method");
}
}
public class Q8{
public static void main(String[] args){
child c = new child();
c.show();
}
}