package practice_1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean Palindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                Palindrome = false;
                break;
            }
        }

        if (Palindrome == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
}
