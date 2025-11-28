//1.	Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. 
// If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. 
// In the exception handler the program should display appropriate message to the user.
// Code:
import java.util.Scanner;
public class Divison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter first number (n1): ");
        n1 = sc.nextInt();
        while (true) {
            try {
                System.out.print("Enter second number (n2): ");
                n2 = sc.nextInt();
                int res = n1 / n2;
                System.out.println("The Result = " + res);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero not allowed. Please enter n2 again.");
            }
        }
        sc.close();
    }
}
