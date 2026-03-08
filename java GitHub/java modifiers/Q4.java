class calculator{
public int add(int a, int b){
return a+b;
}
public int multiply(int a,int b){
return a*b;
}
}
public class Q4{
public static void main(String args[]){
calculator c = new calculator();
System.out.println("Addition : " +c.add(5,3));
System.out.println("Multiplication : " + c.multiply(5,3));
}
}