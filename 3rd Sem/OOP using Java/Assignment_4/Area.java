/*
4.	Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim ()' 
takes length and breadth of rectangle as parameters and the second method named as 'getArea ()' returns the area of the rectangle.
Length and breadth of rectangle are entered through keyboard. [use ‘this’ keyword]
 */

import java.util.Scanner;
class Area {
    int length, breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Area area = new Area();
        area.setDim(l, b);
        System.out.println("The Area of the Rectangle is = " + area.getArea());

        sc.close();
    }
}
