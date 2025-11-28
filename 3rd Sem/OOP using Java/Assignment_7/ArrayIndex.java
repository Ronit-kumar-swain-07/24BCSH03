/*
3.	Write an exception handling java program to print the index position of an existing integer array. 
The index value will be entered by user. It will be handled by exception handler if index position is greaterthen the size of array. 
In the exception handler the program should display appropriate message to the user.
*/

// Code:
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 22, 333, 4444, 55555};

        try {
            System.out.print("Enter index to access the Array Elements (0-4): ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range! Please enter between 0 to 4.");
        }
        sc.close();
    }
}
