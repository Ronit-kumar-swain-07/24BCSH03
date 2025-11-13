import java.util.Scanner;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String s1 = sc.next();
        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        if (s1.equals(s2)) {
            System.out.println(s1 + " and " + s2 + " are Equal.");
        } else {
            System.out.println(s1 + " and " + s2 + " are Not Equal.");
        }
        sc.close();
    }
}