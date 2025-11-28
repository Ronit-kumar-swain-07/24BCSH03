//9.	Write a java program that will compute product of two 1D arrays using multithreading. 
// The program should read two 1D arrays of same size from the user. First thread should multiply the corresponding elements 
// present in the odd index position and second thread should multiply the corresponding elements present in the even index 
// position. Main thread should display the result.
//Code:
import java.util.Scanner; 
class OddIndexProduct extends Thread { 
    int[] a, b, res; 
    OddIndexProduct(int[] a, int[] b, int[] res) {  
        this.a = a;  
        this.b = b;  
        this.res = res;  
    } 
    public void run() { 
        for (int i = 1; i < a.length; i += 2) { 
            res[i] = a[i] * b[i]; 
        } 
    } 
} 
class EvenIndexProduct extends Thread { 
    int[] a, b, res; 
    EvenIndexProduct(int[] a, int[] b, int[] res) {  
        this.a = a;  
        this.b = b;  
        this.res = res;  
    } 
    public void run() { 
        for (int i = 0; i < a.length; i += 2) { 
            res[i] = a[i] * b[i]; 
        } 
    } 
} 
class Q9 { 
    public static void main(String[] args) throws InterruptedException { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size: "); 
        int n = sc.nextInt(); 
        int[] a = new int[n]; 
        int[] b = new int[n]; 
        int[] res = new int[n]; 
        System.out.println("Enter the elements of first array:"); 
        for (int i = 0; i < n; i++) { 
            a[i] = sc.nextInt(); 
        }
        System.out.println("Enter the elements of second array:"); 
        for (int i = 0; i < n; i++) { 
            b[i] = sc.nextInt(); 
        }
        OddIndexProduct t1 = new OddIndexProduct(a, b, res); 
        EvenIndexProduct t2 = new EvenIndexProduct(a, b, res); 
        t1.start();  
        t2.start();  
        t1.join();  
        t2.join();  
        System.out.println("Result array:"); 
        for (int i : res) { 
            System.out.print(i + " "); 
        } 
        sc.close();
    } 
}