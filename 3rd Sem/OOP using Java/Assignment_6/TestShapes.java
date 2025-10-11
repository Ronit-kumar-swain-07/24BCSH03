import java.util.Scanner;
import org.shapes.Square;
import org.shapes.Triangle;
import org.shapes.Circle;

public class TestShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1.Square 2.Triangle 3.Circle");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area: " + sq.area());
                System.out.println("Perimeter: " + sq.perimeter());
                break;

            case 2:
                System.out.print("Enter sides of triangle (a b c): ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                Triangle tr = new Triangle(a, b, c);
                System.out.println("Area: " + tr.area());
                System.out.println("Perimeter: " + tr.perimeter());
                break;

            case 3:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                Circle cr = new Circle(r);
                System.out.println("Area: " + cr.area());
                System.out.println("Perimeter: " + cr.perimeter());
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
