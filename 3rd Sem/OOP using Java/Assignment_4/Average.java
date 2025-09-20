/*
1.	Write a program to print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate 
and print the average. Define another driver class to demonstrate the basic operation.
*/

import java.util.Scanner;

public class Average {
    public static double AvgCal(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double Avg = AvgCal(a,b,c);
        System.out.println("The Average of the Three Numbers is : " + Avg);
        sc.close();
    }
}
