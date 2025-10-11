// File: Test.java
import btech.Student;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter Roll no: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter 3 subject marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Create Student object
        Student s = new Student(rollNo, name, m1, m2, m3);

        // Display result
        s.display();
        sc.close();
    }
}
