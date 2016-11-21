package task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въвдете първото число: ");
		int num1 = scanner.nextInt();

		System.out.print("Въвдете второто число: ");
		int num2 = scanner.nextInt();

		int min = num1 < num2 ? num1 : num2;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

		scanner.close();
	}

}
