//7.Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%). 
// For example, INPUT:  Enter the time in second: 3610 OUTPUT: 1Hour: 0 minute: 10 seconds
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in Seconds : ");
        int a = sc.nextInt();
        int hr = a / 3600;         
        int remainingSeconds = a % 3600;   
        int min = remainingSeconds / 60;         
        int sec = remainingSeconds % 60;
        System.out.println(hr + " Hour: " + min + " minute " + sec + "sec ");
        sc.close();
    }
}
