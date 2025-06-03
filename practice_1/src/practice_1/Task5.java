package practice_1;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = input.nextInt();
		int percent = input.nextInt();
		int result;
		result = balance + (balance * percent) / 100;
		System.out.println(result);
	}
}
