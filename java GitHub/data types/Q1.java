import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name;
        int roll;
        char gender;
        double m1, m2, m3;
        float attendance;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        gender = sc.next().charAt(0);

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextDouble();

        System.out.print("Enter Attendance Percentage: ");
        attendance = sc.nextFloat();

        double total = m1 + m2 + m3;
        double average = total / 3;

        boolean pass = average >= 50;
        boolean eligible = attendance >= 75;

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Gender: " + gender);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if(pass)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        if(eligible)
            System.out.println("Eligible for Exam");
        else
            System.out.println("Not Eligible for Exam");
    }
}