import btech.arithmetic.MyMath;

public class Test1 {
    public static void main(String[] args) {
        MyMath m = new MyMath();

        int a = 20, b = 6;

        System.out.println("Addition: " + m.add(a, b));
        System.out.println("Subtraction: " + m.sub(a, b));
        System.out.println("Multiplication: " + m.mul(a, b));
        System.out.println("Division: " + m.div(a, b));
        System.out.println("Modulus: " + m.mod(a, b));
    }
}
