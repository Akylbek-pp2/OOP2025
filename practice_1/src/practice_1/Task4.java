package practice_1;
import java.util.Scanner;
import java.lang.Math;

public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		//ax2 + bx + c = 0
		double D = Math.pow(b, 2) - 4 * a * c;
		double sqrt_d = Math.sqrt(D);
		double double_a = 2 * a;
		double x_1, x_2;
		if(D > 0) {
			x_1 = (-1 * b + sqrt_d) / double_a;
			x_2 = (-1 * b - sqrt_d) / double_a;
			System.out.println("x1 is " + x_1 + '\n' + "x2 is " + x_2);
		} else if(D == 0) {
			x_1 = (-1 * b) / double_a;
			System.out.println("x is " + x_1);
		} else {
			System.out.println("D is negative");
		}
	}
}
