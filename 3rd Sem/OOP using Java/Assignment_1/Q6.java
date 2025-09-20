// 6.	Write a program to input the marks of a student in three different subjects and then display the average mark.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Physics : ");
        int a = sc.nextInt();
        System.out.println("Enter the Marks of Chemistry : ");
        int b = sc.nextInt();
        System.out.println("Enter the Marks of Mathematics : ");
        int c = sc.nextInt();
        int total = (a+b+c);
        double avg = (total/3.0);
        System.out.println("Your Total Mark is : " + total);
        System.out.println("Your Average Mark is : " + avg);
        sc.close();
    }
}
