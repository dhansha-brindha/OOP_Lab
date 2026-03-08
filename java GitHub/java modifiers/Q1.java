class student{
private String name;
private int marks;
public void setdetials(String n, int m){
name=n;
marks=m;
}

public void display(){
System.out.println("Name : " + name);
System.out.println("Marks : " + marks);
}
}
public class Q1{
public static void main(String args[]){
student s = new student();
s.setdetials("Dhansha",99);
s.display();
}
}