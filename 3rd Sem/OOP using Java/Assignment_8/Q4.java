
//4.	Write a java program that will create one thread [using extends]. The main thread will read a number and check the 
// number is prime or composite and the same time the new thread will check the number palindrome or not.

//Code:
import java.util.Scanner;

class CheckPalindrome extends Thread {
    int n;

    CheckPalindrome(int n) {
        this.n = n;
    }

    public void run() {
        int temp = n;
        int rem, rev = 0;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n)
            System.out.println(n + " is a palindrome number.");
        else
            System.out.println(n + " is not a palindrome number.");
    }
}

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        CheckPalindrome t = new CheckPalindrome(n);
        t.start();
        boolean isPrime = true;
        if (n <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
        sc.close();
    }
}
