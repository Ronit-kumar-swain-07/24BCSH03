import java.util.Scanner;
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        String[] words = name.split(" ");
        StringBuilder sb = new StringBuilder(words.length);

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
        }
        System.out.println("Your Initials String is: " + sb);
        sc.close();
    }
}
