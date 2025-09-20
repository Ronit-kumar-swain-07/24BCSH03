public class GCD {
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int res = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + res);
    }
}
