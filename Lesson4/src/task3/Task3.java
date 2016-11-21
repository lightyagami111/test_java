package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a: ");
		int a = scanner.nextInt();

		System.out.print("b: ");
		int b = scanner.nextInt();

		// 18 ... 2
		if (a > b) {
			a = a - b; // 16
			b = a + b; // 18
			a = b - a; // 2
		}

		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
