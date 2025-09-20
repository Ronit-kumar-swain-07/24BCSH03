/*
2.Write a program to create a class named 'Student' with members 'name', 'roll_no', ‘branch’. Declare two methods to input the student 
details and display the details of the student. Create a driver class to test the functionalities of the above class.
 */

import java.util.Scanner;
class Student
{
String name;
int roll;
String branch;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Name:");
name= sc.nextLine();
System.out.println("Enter Your RollNo:");
roll = sc.nextInt();
System.out.println("Enter Your Branch");
branch = sc.next();
sc.close();
}
void Display()
{
System.out.println("Student Details:");
System.out.println("Name: " + name);
System.out.println("RollNo: " + roll);
System.out.println("Branch: " + branch);
}

public static void main(String[] args)
{
Student obj = new Student();
obj.input();
obj.Display();
}
}
