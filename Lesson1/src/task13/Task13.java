package task13;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int tempCelsius = scanner.nextInt();

		if (tempCelsius <= -20) {
			System.out.println("ледено студено");
		} else if (tempCelsius > -20 && tempCelsius <= 0) {
			System.out.println("студено");
		} else if (tempCelsius > 0 && tempCelsius <= 15) {
			System.out.println("хладно");
		} else if (tempCelsius > 15 && tempCelsius <= 25) {
			System.out.println("топло");
		} else {
			System.out.println("горещо");
		}

		scanner.close();

	}

}
