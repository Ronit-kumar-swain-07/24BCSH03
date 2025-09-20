    // Q4. Write a program to swap two numbers without using a third variable.

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        x += y;
        y = x - y;
        x -= y;
        System.out.println("After swapping, x: " + x + " and y: " + y);
        sc.close();
    }
}