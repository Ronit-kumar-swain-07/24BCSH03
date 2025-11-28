//5.	Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, 
// and the main thread will display all the even numbers between m and n.
//Code:
import java.util.*;
class OddThread extends Thread { 
    private int m, n; 
    OddThread(int m, int n) {  
        this.m = m;  
        this.n = n;  
    } 
    public void run() { 
        System.out.print("Odd numbers: ");
        for (int i = m; i <= n; i++) { 
            if (i % 2 != 0)  
                System.out.print(i + " "); 
        }
        System.out.println(); 
    } 
} 
class Q5 { 
    public static void main(String[] args) throws InterruptedException { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter m and n: ");                                                                                                                     
        int m = sc.nextInt(), n = sc.nextInt(); 
        OddThread t = new OddThread(m, n); 
        t.start();
        t.join();
        System.out.print("Even numbers: ");
        for (int i = m; i <= n; i++) { 
            if (i % 2 == 0)  
                System.out.print(i + " "); 
        }
        System.out.println(); 
        sc.close();
    } 
}
