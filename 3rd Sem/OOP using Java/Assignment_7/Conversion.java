
/*
7.	Write a program that prompts the user to enter a length in feet and inches and outputs the equivalent length in centimetres. 
If the user enters a negative number or a non-digit number, throw and handle an appropriate exception and 
prompt the user to enter another set of numbers.
*/
//Code:
import java.util.*;

class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter feet: ");
                double f = sc.nextDouble();
                System.out.print("Enter inches: ");
                double i = sc.nextDouble();
                if (f < 0 || i < 0)
                    throw new IllegalArgumentException();
                double cm = (f * 12 + i) * 2.54;
                System.out.println("Equivalent length in centimeters: " + cm);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter numeric values.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Negative values not allowed. Try again.");
            }
        }
    }
}