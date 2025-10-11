import java.util.Scanner;

abstract class Shape{
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

class Area extends Shape{
    void RectangleArea(int length, int breadth){
        double area = length*breadth;
        System.out.println("The Area of the Rectangle is : " + area);
    }

    void SquareArea(int side){
        double area = side*side;
        System.out.println("The Area of the Square is : " + area);

    }

    void CircleArea(int radius){
        double area = Math.PI*radius*radius;
        System.out.println("The Area of the Circle is : " + area);

    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Area a = new Area();
        System.out.print("Enter the Length and Breadth of the Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        a.RectangleArea(l, b);
        System.out.println("Enter the Side of the Square : ");
        int s = sc.nextInt();
        a.SquareArea(s);
        System.out.println("Enter the Radius of the Circle: ");
        int r = sc.nextInt();
        a.CircleArea(r);
        sc.close();
    }
    
}
