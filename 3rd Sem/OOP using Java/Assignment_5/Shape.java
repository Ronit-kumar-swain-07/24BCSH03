// Base class
class BaseShape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

// Circle class
class Circle extends BaseShape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Triangle class
class Triangle extends BaseShape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Square class
class Square extends BaseShape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

// Driver class
public class Shape {
    public static void main(String[] args) {
        // Superclass reference
        BaseShape s;

        // Circle
        s = new Circle();
        s.draw();
        s.erase();

        // Triangle
        s = new Triangle();
        s.draw();
        s.erase();

        // Square
        s = new Square();
        s.draw();
        s.erase();
    }
}
