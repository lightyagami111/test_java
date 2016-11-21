package task16;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("M: ");
		int m = scanner.nextInt();

		System.out.print("N: ");
		int n = scanner.nextInt();
		// check interval [10...5555]

		if ((m < 10) || (n > 5555)) {
			System.out.println("Невалиден интервал.");
		}

		for (int i = n; i >= m; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}

		}

		scanner.close();

	}

}
