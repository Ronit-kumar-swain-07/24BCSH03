// 12.	Write a recursive program to find the sum of n natural numbers. [ n is user input ]

import java.util.Scanner;
public class Sum {
public static int sum(int x){
    if (x ==0) {
        return 0;
    }
        else if (x ==1) {
            return 1;
        }
        else
        {
            return x + sum(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x = sc.nextInt();
        int Sum = sum(x);
        System.out.println("The Sum is : " + Sum);
        sc.close();
    }
}
