// 9.	Write a program to display all Armstrong numbers from 1 to 10000.

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 10000 are:");

        for (int num = 1; num <= 10000; num++) {
            int originalNum = num;
            int digits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}