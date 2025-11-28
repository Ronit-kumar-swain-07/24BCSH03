//10.	Write a simple Java thread program to compute the sum of n natural numbers. The program should read the number of 
// threads m and value of n from the user. Each of the threads should add its share of assigned number to a global variable.
// When all the threads are done, the global variable should contain the result. The program should use a Synchronized block to 
// make sure that only one thread is updating the global variable at a given time.

//Code:
import java.util.Scanner;
class SumThread extends Thread {
    int start, end;
    static int total = 0;
    static final Object lock = new Object();
    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        int sum = 0;
        System.out.println(getName() + " adding numbers from " + start + " to " + end);
        for (int i = start; i <= end; i++) sum += i;
        synchronized (lock) {
            total += sum;
            System.out.println(getName() + " finished. Partial sum = " + sum + ", Total = " + total);
        }
    }
}
public class Q10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        int part = n / m;
        int start = 1;
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : (start + part - 1);
            SumThread t = new SumThread(start, end);
            t.setName("Thread-" + (i + 1));
            t.start();
            t.join(); // Wait for this thread to finish before starting the next
            start = end + 1;
        }
        System.out.println("Final Sum of first " + n + " natural numbers = " + SumThread.total);
        sc.close();
    }
}