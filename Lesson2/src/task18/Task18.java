package task18;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число в интервала [1...9]: ");
		int number1 = scanner.nextInt();

		System.out.print("Въведете число в интервала [1...9]: ");
		int number2 = scanner.nextInt();

		if (number1 < number2) {
			number1 = number1 - number2;
			number2 = number1 + number2;
			number1 = number2 - number1;
		}

		if ((number1 >= 1 && number1 <= 9) && (number2 >= 1 && number2 <= 9)) {
			for (int i = 1; i <= number1; i++) {
				for (int j = 1; j <= number2; j++) {
					System.out.print(i + "*" + j + "=" + i * j);
					System.out.println();
				}
			}
		} else {
			System.out.println("Невалидни входни данни.");
		}

		scanner.close();

	}

}
