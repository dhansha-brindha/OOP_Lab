import student.student;
import result.result;
public class Main{
public static void main(String args[]){
student s = new student("Dhansha", 99);
result r = new result();
r.calculategrade(s);
}
}