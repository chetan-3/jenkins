import java.util.Scanner;

class Student {
    String name;
    String id;
    String contactNumber;
    String email;
    int age;
    String course;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        id = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        contactNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        email = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Course: ");
        course = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();

        student.getDetails();
        student.displayDetails();
    }
}
