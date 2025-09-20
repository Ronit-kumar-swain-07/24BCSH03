// 1.	Write a program to calculate tax, given the following conditions:
/*
a.	If income is less than 150000 then no tax
b.	If taxable income is in the range 150001 to 300000 then charge 10% tax
c.	If taxable income is in the range 300001 to 500000 then charge 20% tax
d.	If taxable income is above 500001 then charge 30% tax
*/
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income < 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.10;
        } else if (income <= 500000) {
            tax = (150000 * 0.10) + (income - 300000) * 0.20;
        } else {
            tax = (150000 * 0.10) + (200000 * 0.20) + (income - 500000) * 0.30;
        }

        System.out.println("Your have to pay the amount of ₹" + tax + " as TAX.");

        sc.close();
    }
}
