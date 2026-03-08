class animal{
protected String name ="dog";
}
class dog extends animal{
void show(){
System.out.println("animal name: " + name);
}
}
public class Q3{
public static void main(String args[]){
dog d = new dog();
d.show();
}
}