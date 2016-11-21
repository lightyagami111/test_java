package task21;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число в интервала [1...51]: ");

		int input = scanner.nextInt();

		int num = 0;
		int pos = 0;

		if (input >= 1 && input <= 51) {
			// rows
			for (int row = 2; row < 15; row++) {

				for (int col = row, s = 1; col < row + 4 && s <= 4; col++, s++) {
					num = row; // числото
					int numberPos = ++pos;

					// check input
					if (numberPos >= input) {

						// check card height
						switch (num) {
						case 11:
							System.out.print("вале");
							break;

						case 12:
							System.out.print("дама");
							break;

						case 13:
							System.out.print("поп");
							break;

						case 14:
							System.out.print("асо");
							break;

						default:
							System.out.print(num);
							break;
						}

						// check card color
						switch (s) {
						case 1:
							System.out.print(" спатия, ");
							break;

						case 2:
							System.out.print(" каро, ");
							break;

						case 3:
							System.out.print(" купа, ");
							break;

						case 4:
							System.out.print(" пика, ");
							break;

						default:
							break;
						}

					}
					// <---check input

				}

			}
		} else {
			System.out.println("Невалидни входни данни.");
		}

		scanner.close();

	}

}
