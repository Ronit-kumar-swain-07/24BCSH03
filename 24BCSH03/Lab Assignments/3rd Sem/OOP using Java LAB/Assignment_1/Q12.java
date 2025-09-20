// 12.	 Write a program to test whether a number is positive, negative or equal to zero.

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        if (x == 0) {
            System.out.println("Zero");
        }
        else if (x > 0) {
            System.out.printf("%d is a POSITIVE Number.\n",x);
        }
        else
        System.out.printf("%d is a NEGATIVE Number.\n",x);
        sc.close();
    }
}
