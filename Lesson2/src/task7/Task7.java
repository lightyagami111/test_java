package task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете n: ");
		int n = scanner.nextInt();

		int start = 3;
		for (int i = 3; i <= start * n; i += 3) {
			if (i == start * n) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}

		scanner.close();
		
	}

}
