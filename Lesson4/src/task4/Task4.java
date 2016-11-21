package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("number: ");
		int number = sc.nextInt();
		boolean isPrime = true;

		if (number > 0) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			System.out.println(isPrime ? "просто" : "не е просто");
		} else {
			System.out.println("Невалидни входни данни.");
		}

		sc.close();
	}

}
