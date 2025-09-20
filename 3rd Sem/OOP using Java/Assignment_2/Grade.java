// 2.Write a program to enter the marks of a student in 4 different subjects. 
// Then display the grade of the student as per the following conditions:
/* 
a.	If the average mark is greater than or equal to 90 then grade is O
b.	If the average mark is greater than equal to 80 but less than 90 then grade is E
c.	If the average mark is greater than equal to 70 but less than 80 then grade is A
d.	If the average mark is greater than equal to 60 but less than 70 then grade is B
e.	If the average mark is greater than equal to 50 but less than 60 then grade is C
f.	If the average mark is less than 50 then grade is F
*/
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[4];
        int sum = 0;

        System.out.println("Enter the marks in 4 subjects: ");
        for (int i = 0; i < 4; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = sum / 4.0;
        char grade;

        if (average >= 90) {
            grade = 'O';
        } else if (average >= 80) {
            grade = 'E';
        } else if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your Average Marks is : " + average);
        System.out.println("Your Grade is : " + grade);
        sc.close();
    }
}