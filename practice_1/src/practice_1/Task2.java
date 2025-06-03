package practice_1;
import java.util.Scanner;
import java.lang.Math;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		a = input.nextInt();
		int area = a * a;
		System.out.println("Area is " +  area + "\n" + "Perimeter is " + 4 * a);
		System.out.println("Length of d is " + Math.sqrt(area * 2));
	}
}
