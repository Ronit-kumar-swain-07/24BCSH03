import java.util.Scanner;

// Base class
class Figure {
    double dim1, dim2;

    Figure(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    double area() {
        System.out.println("Area of figure is not defined.");
        return 0;
    }
}

// Rectangle class
class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

// Triangle class
class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Square class
class Square extends Figure {
    Square(double side) {
        super(side, side); // dim1 = side, dim2 also = side
    }

    @Override
    double area() {
        return dim1 * dim1;
    }
}

// Driver class
public class Figured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure f;

        // Rectangle
        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        f = new Rectangle(l, b);
        System.out.println("Area of Rectangle: " + f.area());

        // Triangle
        System.out.print("\nEnter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double h = sc.nextDouble();
        f = new Triangle(base, h);
        System.out.println("Area of Triangle: " + f.area());

        // Square
        System.out.print("\nEnter side of Square: ");
        double s = sc.nextDouble();
        f = new Square(s);
        System.out.println("Area of Square: " + f.area());

        sc.close();
    }
}
