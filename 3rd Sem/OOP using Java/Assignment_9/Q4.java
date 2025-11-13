import java.util.Scanner;
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("The Total number of Characters present in " + "'" + s + "'"+ " are : " + s.length());
        sc.close();
    }
}
