// 7.	Write a program to check whether an inputted number is palindrome or not.

import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int Num = x;
        int rev = 0;
        while (x != 0) {
            int a = x % 10;
            rev = rev * 10 + a;
            x = x / 10;
        }
        if (Num == rev) {
            System.out.println(Num + " is a Palindrome.");
        } else {
            System.out.println(Num + " is NOT a Palindrome.");
        }
        
        sc.close();
    }
}