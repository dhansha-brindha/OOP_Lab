class Employee{
int salary;

Employee(int salary){
this.salary=salary;
}
}

class Developer extends Employee{

Developer(int salary){
super(salary);
}

void CalcBonus(){
double bonus = 0.05*salary ;
System.out.println("The developer's salary is: " + (salary+bonus));
}
}

public class Q4{
public static void main(String[] args){
Developer d = new Developer(50000);
d.CalcBonus();
}
}