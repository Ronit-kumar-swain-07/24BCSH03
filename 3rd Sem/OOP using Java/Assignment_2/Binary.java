// 8.	Write a program to find out the binary equivalent of any inputted decimal number.

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int num = sc.nextInt();
        int decimal = num;
        String Binary = "";
        while (decimal > 0) {
            Binary = (decimal % 2) + Binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary equivalent is : " + Binary);

        // String binary = Integer.toBinaryString(num);
        // System.out.println("Binary equivalent (using built-in): " + binary);
        
        sc.close();
    }
}
