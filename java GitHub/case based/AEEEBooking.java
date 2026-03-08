import java.util.Scanner;

class ExamBooking {

    String studentName;
    String examCenter;

    void bookExam(String name, String center) {
        studentName = name;
        examCenter = center;
    }

    void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Exam Center: " + examCenter);
        System.out.println("AEEE Exam Slot Booked!");
    }
}

public class AEEEBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamBooking e = new ExamBooking();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Exam Center: ");
        String center = sc.nextLine();

        e.bookExam(name, center);
        e.displayDetails();
    }
}