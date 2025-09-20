// 3.	Write a program to calculate the roots of a quadratic equation.
import java.util.Scanner;
public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficient of X^2(a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient of X(b): ");
        double b = sc.nextDouble();

        System.out.print("Enter the Constant term: ");
        double c = sc.nextDouble();
        
        double D = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a ≠ 0 required).");
        } else if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }

        sc.close();
    }
}