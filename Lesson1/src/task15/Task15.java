package task15;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете естествено число в интервала [0...24]: ");
		int number = scanner.nextInt();

		if (number > 9 && number <= 18) {
			System.out.println("Добър ден");
		} else if (number > 4 && number <= 9) {
			System.out.println("Добро утро");
		} else {
			System.out.println("Добър вечер");
		}

		scanner.close();

	}

}
