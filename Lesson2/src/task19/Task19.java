package task19;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число в интервала [10...99]: ");
		int num = scanner.nextInt();

		if (num >= 10 && num <= 99) {
			while (true) {
				int k = 0;

				if (num == 1) {
					break;
				}

				if (num % 2 == 1) {
					k = 3 * num + 1;
					System.out.print(k + " ");
				}

				if (num % 2 == 0) {
					k = num * 5 / 10;
					System.out.print(k + " ");
				}

				num = k;
			}
		} else {
			System.out.println("Невалидни данни.");
		}

		scanner.close();

	}

}
