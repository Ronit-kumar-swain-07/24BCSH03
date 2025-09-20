/* 8.	Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. The class should have a parameterized 
constructor to initialize its data members. It should also have methods displayCompNumber() to display the complex number 
(in the format 5+3i for example), addCompNumber() to add two Complex numbers. Test these methods by creating main method in another class.
*/

import java.util.Scanner;

class ComplexNum {
    int real, img;

    ComplexNum(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
//}

// Driver class
//public class ComplexNumDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Real and Imaginary part of the First Complex Number : ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.print("Enter the Real and Imaginary part of the Second Complex Number : ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);

        System.out.print("First: ");
        c1.displayCompNumber();

        System.out.print("Second: ");
        c2.displayCompNumber();

        ComplexNum sum = c1.addCompNumber(c2);
        System.out.print("Sum: ");
        sum.displayCompNumber();
        sc.close();
    }
}
