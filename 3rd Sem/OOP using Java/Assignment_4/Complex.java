/*
3.	Declare a class Complex with member real and imaginary part. Define a method initialise() to input the two complex numbers, show() to 
display the complex number and add() to add the two complex numbers. Declare another class to illustrate the operations of the Complex class.
 */

import java.util.Scanner;

class Complex {
    int real, img;

    void initialise(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter Real and Imaginary part of First Complex Number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        c1.initialise(r1,i1);

        System.out.println("Enter Real and Imaginary part of Second Complex Number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        c2.initialise(r2,i2);

        System.out.print("First Complex Number: ");
        c1.show();

        System.out.print("Second Complex Number: ");
        c2.show();

        Complex c3 = c1.add(c2);
        System.out.print("Sum = ");
        c3.show();

        sc.close();
    }
}
