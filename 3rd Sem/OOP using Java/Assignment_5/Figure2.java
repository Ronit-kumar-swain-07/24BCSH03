import java.util.Scanner;

// Abstract class
abstract class Figure {
    double dim1, dim2;

    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    // Abstract method
    abstract double getArea();
}

// Rectangle class
class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double getArea() {
        return dim1 * dim2; // length * breadth
    }
}

// Triangle class
class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double getArea() {
        return 0.5 * dim1 * dim2; // 0.5 * base * height
    }
}

// Driver class
public class Figure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure f; // Superclass reference

        // Rectangle input
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        f = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + f.getArea());

        System.out.println();

        // Triangle input
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        f = new Triangle(base, height);
        System.out.println("Area of Triangle: " + f.getArea());

        sc.close();
    }
}
