/*
7.	Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are 
width,height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and 
test the functionalities [use this keyword].
 */
import java.util.Scanner;
class Volume {
    double width, height, depth;

    Volume(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Width of the Box : ");
        double w = sc.nextDouble();
        System.out.print("Enter the Height of the Box : ");
        double h = sc.nextDouble();
        System.out.print("Enter the Depth of the Box : ");
        double d = sc.nextDouble();
        Volume b = new Volume(w,h,d);
        System.out.println("The Volume of the Box is  = " + b.volume());
        sc.close();
    }
}
