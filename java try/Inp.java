import java.util.Scanner;
public class Inp {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the marks student got");
        int marks = a.nextInt();
         if (marks >= 90) {
            System.out.println("the student got A grade");
         }
         else if (marks>=75) {
            System.out.println("grade b");
         }
         a.close();

    }
    
}
