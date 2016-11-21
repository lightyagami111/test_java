package task8;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Въведете n: ");

		int num = scanner.nextInt();

		int c = num - 1;

		if (num > 0) {
			for (int row = 1; row <= num; row++) {
				int counter = 1;

				while (counter <= num) {
					System.out.print(c + " ");
					counter++;
				}

				c += 2;
				System.out.println();
			}
		} else {
			System.out.println("Невалидни входни данни.");
		}

		scanner.close();
	}

}
