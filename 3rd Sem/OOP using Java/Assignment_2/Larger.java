// 10.	Write a program to find out the largest between two numbers using a conditional operator.

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int largest = (a > b) ? a : b;

        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}