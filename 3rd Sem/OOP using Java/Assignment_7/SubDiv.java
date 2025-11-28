/*
2.	Write a java program to read two numbers x and y and calculate x/(xy). The program should check the value of xy. 
// Before dividing with x, it should throw an exception if xy is zero. In the exception handler the program should display 
// appropriate message to the user.
*/

// Code:
import java.util.Scanner;
public class SubDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        try {
            if (x - y == 0) {
                throw new ArithmeticException("Denominator (x - y) cannot be zero.");
            }
            double result = x / (x - y);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
