    // Q5. Write a program to check a number is odd or even.

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even number");
        } else {
            System.out.println(num + " is Odd number");
        }
        sc.close();
    }
}