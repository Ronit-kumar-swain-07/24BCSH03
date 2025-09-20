// 13.	Write a recursive program to find the GCD of two inputted numbers. 

import java.util.Scanner;
public class GCD_rec {
    public static int GCD(int a, int b){
        if (b == 0) {
            return a;
        }
        else{
            return GCD(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = GCD(a,b);
        System.out.println("The GCD of " + a + " and " + b + " is " + GCD);
        sc.close();
    }
}
