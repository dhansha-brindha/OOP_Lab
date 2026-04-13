package banking;
public class account{
private void privatemethod(){
System.out.println("Private Method");
}
protected void protectedmethod(){
System.out.println("Protected method");
}
public void publicmethod(){
System.out.println("public method");
}
public void accessprivate(){
privatemethod();
}
}