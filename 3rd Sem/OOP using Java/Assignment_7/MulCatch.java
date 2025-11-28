// 4.	Write a program to illustrate the use of multiple catch blocks associated with a single try block.
// Code:
import java.util.*;
public class MulCatch {
    public static void main(String args[]) {
    try {
        int a = 10, b = 0, c;
        c = a / b;
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(arr[7]);
        } 
    catch (ArithmeticException e) {
            System.out.println("Exception: ArithmeticException");
        } 
    catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array Index OutOfBounds Exception.");
        } 
    catch (Exception e) {
            System.out.println("General Exception.");
        }
    }
}
