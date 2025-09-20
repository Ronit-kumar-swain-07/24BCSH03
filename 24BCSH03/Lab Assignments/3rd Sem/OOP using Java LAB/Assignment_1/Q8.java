// 8.	Write a program to reverse a number.

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        int temp = x,a,rev = 0;
        while (temp != 0) {
            a = temp%10;
            rev = rev*10+a;
            temp/=10;
        }
        System.out.printf("The reverse of %d is %d.\n",x,rev);
        sc.close();
    }
}

