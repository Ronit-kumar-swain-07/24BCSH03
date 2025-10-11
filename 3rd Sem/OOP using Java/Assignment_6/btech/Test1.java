package btech;
import btech.arithmetic.MyMath;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MyMath m = new MyMath();
        System.out.println("The Addition is : " + m.add(a, b));
        System.out.println("The Subtraction is : " + m.sub(a, b));
        System.out.println("The Product is : " + m.mul(a, b));
        System.out.println("The Division is : " + m.div(a, b));
        System.out.println("The Modulus is : " + m.mod(a, b));
        sc.close();
    }
}
