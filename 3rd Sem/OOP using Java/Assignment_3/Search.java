import java.util.Scanner;

class Search {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Enter the element to search:");
        int ele = sc.nextInt();


        boolean found = false;
        for (int i = 0; i < n; i++) 
	{
            if (arr[i] == ele) 
	    {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }

    }
}
