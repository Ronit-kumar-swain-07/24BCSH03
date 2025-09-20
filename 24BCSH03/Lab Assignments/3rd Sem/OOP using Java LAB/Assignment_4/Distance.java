/*
9.	Design a class ‘Point’ with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data 
members. Define a method distanceBetPoints() which returns the distance between two points.
 */

import java.util.Scanner;

public class Distance {
    int xCo, yCo;

    Distance(int x, int y) {
        this.xCo = x;
        this.yCo = y;
    }

    double distanceBetPoints(Distance p) {
        return Math.sqrt(Math.pow(this.xCo - p.xCo, 2) + Math.pow(this.yCo - p.yCo, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X and Y cordinates of the First Point : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter the X and Y cordinates of the Second Point : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Distance p1 = new Distance(x1,y1);
        Distance p2 = new Distance(x2,y2);
        System.out.println("The Distance is  = " + p1.distanceBetPoints(p2));
        sc.close();
    }
}
