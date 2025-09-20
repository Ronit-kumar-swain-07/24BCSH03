// 9. Write a program to check if a number is prime or not.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is a Prime Number.");
        } else {
            System.out.println(a + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
