package task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		double money = scanner.nextDouble();
		boolean healthy = scanner.nextBoolean();

		if (!healthy) {
			System.out.println("Няма да излизам.");

			if (money != 0) {
				System.out.println("Ще си купя лекарства.");
			} else {
				System.out.println("Ще стоя вкъщи и ще пия чай.");
			}
		} else {
			if (money < 10) {
				System.out.println("Ще отида на кафе.");
			} else {
				System.out.println("Ще излизам с приятели.");
			}
		}

		scanner.close();

	}

}
