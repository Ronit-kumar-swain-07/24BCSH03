import java.util.Scanner;
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s.length() + 1);

        for (String word : s.split(" ")) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(' ');
        }
        System.out.println("Transformed String is: " + sb);

        sc.close();
    }
}
