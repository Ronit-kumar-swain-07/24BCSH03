// 11.	 Write a program to check whether an inputted number is positive or negative.

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.printf("%d is a POSITIVE Number.\n",x);
        }
        else
        System.out.printf("%d is a NEGATIVE Number.\n",x);
        sc.close();
    }
}
