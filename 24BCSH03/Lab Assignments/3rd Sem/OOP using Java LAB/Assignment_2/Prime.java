// 6.	Write a program to check whether an inputted number is prime or not.

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime NUmber.");
        }
        else
        {
            System.out.println("Not Prime Number.");
        }
        sc.close();
    }
}
