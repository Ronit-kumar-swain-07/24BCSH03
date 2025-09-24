import java.util.Scanner;

// Superclass
class Point2D {
    int x, y;

    // Default constructor
    Point2D() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    void display() {
        System.out.println("2D Point: (" + x + ", " + y + ")");
    }
}

// Subclass
class Point3D extends Point2D {
    int z;

    // Default constructor
    Point3D() {
        super();   // calls Point2D default constructor
        z = 0;
    }

    // Parameterized constructor
    Point3D(int x, int y, int z) {
        super(x, y);  // calls Point2D parameterized constructor
        this.z = z;
    }

    // Show method
    void show() {
        System.out.println("3D Point: (" + x + ", " + y + ", " + z + ")");
    }
}

// Driver class
public class Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Point2D
        System.out.print("Enter X and Y coordinates for 2D Point: ");
        int x2d = sc.nextInt();
        int y2d = sc.nextInt();
        Point2D p2d = new Point2D(x2d, y2d);
        p2d.display();

        System.out.println();

        // Input for Point3D
        System.out.print("Enter X, Y and Z coordinates for 3D Point: ");
        int x3d = sc.nextInt();
        int y3d = sc.nextInt();
        int z3d = sc.nextInt();
        Point3D p3d = new Point3D(x3d, y3d, z3d);
        p3d.show();

        sc.close();
    }
}
