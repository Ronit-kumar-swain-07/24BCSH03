// File: Student.java
package btech;

public class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    // Parameterized constructor
    public Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to display details
    public void display() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Roll_no   : " + rollNo);
        System.out.println("Name      : " + name);
        System.out.println("-----------MARKS-----------");
        System.out.println("Sub 1     : " + m1);
        System.out.println("Sub 2     : " + m2);
        System.out.println("Sub 3     : " + m3);
        System.out.println("Total     : " + total);
        System.out.println("Percentage: " + percentage);
    }
}
