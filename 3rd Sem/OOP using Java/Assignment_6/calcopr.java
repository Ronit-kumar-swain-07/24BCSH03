import java.util.*;
interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}

class DemoCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed!");
            return 0;
        }
        else
        {
        return (double) a / b;
        }
    }
}

public class calcopr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator calc = new DemoCalculator();

        System.out.println("The Addition is : " + calc.add(a,b));
        System.out.println("The Subtraction is : " + calc.sub(a,b));
        System.out.println("The Product is : " + calc.mul(a,b));
        System.out.println("The Division is : " + calc.div(a,b));
        sc.close();
    }
}
