package practice_1;

public class Task1 {
	public static void main(String[] args) {
		String my_name = "Akylbek";
		for(int i = 0; i < my_name.length(); i++) {
			if(i == 0) {
				System.out.print('+');
			}
			System.out.print('-');
			if(i == my_name.length() - 1) {
				System.out.println('+');
			}
		}
		for(int i = 0; i < my_name.length(); i++) {
			if(i == 0 || i == my_name.length() - 1) {
				System.out.print('|');
			}
			if(i == 1) {
				System.out.print(my_name);
			}
			
		}
		for(int i = 0; i < my_name.length(); i++) {
			if(i == 0) {
				System.out.print("\n+");
			}
			System.out.print('-');
			if(i == my_name.length() - 1) {
				System.out.println('+');
			}
		}
	}
}
