// 10.	Write a program to find out the sum of the individual digits of a number.

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int temp = x, sum = 0,a;
        while (temp != 0) {
            a = temp%10;
            sum+=a;
            temp/=10;
        }
        System.out.printf("The sum of the individual numbers of %d is : %d\n",x,sum);
        sc.close();
    }
}
