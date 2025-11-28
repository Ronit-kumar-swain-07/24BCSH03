/*
11.	Write a Java thread program to search the minimum number in a given array. The program should read the number of 
elements in the array, number of threads to be created and the array elements from the user. Each thread should find minimum 
element in an assigned block of elements and compare to global minimum element. When all the threads are done, the global 
variable should contain the minimum element. It should use a Synchronized block to make sure that only one thread is 
updating the global minimum variable at any given time.
*/

//Code:
import java.util.*;
class MinFinder extends Thread {
    int[] arr;
    int start, end;
    static int globalMin = Integer.MAX_VALUE;
    static final Object lock = new Object();
    MinFinder(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    public void run() {
        int localMin = Integer.MAX_VALUE;
        System.out.println(getName() + " checking from index " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            if (arr[i] < localMin) localMin = arr[i];
        }
        synchronized (lock) {
            if (localMin < globalMin) globalMin = localMin;
            System.out.println(getName() + " finished. Local Min = " + localMin + ", Global Min = " + globalMin);
        }
    }
}
public class Q11 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        int part = n / m;
        int start = 0;
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? (n - 1) : (start + part - 1);
            MinFinder t = new MinFinder(arr, start, end);
            t.setName("Thread-" + (i + 1));
            t.start();
            t.join();
            start = end + 1;
        }
        System.out.println("Minimum element in the array = " + MinFinder.globalMin);
        sc.close();
    }
}