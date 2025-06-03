package practice_1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String s;

        if (a >= 95 && a <= 100) {
            s = "A";
        } else if (a >= 90) {
            s = "A-";
        } else if (a >= 80) {
            s = "B";
        } else if (a >= 70) {
            s = "C+";
        } else if (a >= 60) {
            s = "C-";
        } else if (a >= 50) {
            s = "D";
        } else {
            s = "F";
        }

        System.out.println("Your grade is: " + s);
    }
}
