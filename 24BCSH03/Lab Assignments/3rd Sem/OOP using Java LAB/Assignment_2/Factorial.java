// 5.	Write a program to find out the factorial of any inputted number.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter a Number : "));
        int x = sc.nextInt();
        int fact = 1;
        for(int i = x;i>0;i--)
        {
            fact*=i;
        }
        System.out.printf("%d! = %d\n",x,fact);
        sc.close();
    }
}
