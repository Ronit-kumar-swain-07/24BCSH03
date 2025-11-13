import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String S = sc.nextLine();
        System.out.print("Enter the Sub-String to be Replaced: ");
        String s = sc.nextLine();
        System.out.print("Enter the String to replace with: ");
        String R = sc.nextLine();
        System.out.println("The Original String is : " + S);
        System.out.println("String After Replacement: " + S.replace(s, R));
        sc.close();
    }
}
