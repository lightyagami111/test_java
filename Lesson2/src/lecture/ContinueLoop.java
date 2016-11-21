package lecture;

import java.util.Scanner;

public class ContinueLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;

		do {
			System.out.print("Въведте + число: ");
			number = scanner.nextInt();

		} while (number < 0);

		if (number % 2 == 0) {
			System.out.println("четно");
		} else {
			System.out.println("нечетно");
		}
		
		scanner.close();

	}

}
