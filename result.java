package result;
import student.student;
public class result{
public void calculategrade(student s){
int m = s.getmarks();
if(m>=90)
System.out.println(s.getname() + "Grade: A");
else if (m>=75)
System.out.println(s.getname() + "Grade: B");
else if (m >= 50)
System.out.println(s.getname() + "Grade: C");
else
System.out.println(s.getname() + "Grade: FAIL");
}
}