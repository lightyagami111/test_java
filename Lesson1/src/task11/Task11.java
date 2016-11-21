package task11;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Въведете трицифрено число: ");
		int number = scanner.nextInt();

		int digit1 = number / 100;
		int digit2 = (number / 10) % 10;
		int digit3 = number % 10;

		if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
			System.out.println("Невалиден вход. Числото не трябва да съдържа цифрата 0.");
		} else if (number % digit1 == 0 && number % digit2 == 0 && number % digit3 == 0) {
			System.out.println("Числото " + number + " се дели на всяка своя цифра.");
		} else {
			System.out.println("Числото " + number + " не се дели на всяка своя цифра.");
		}

		
		scanner.close();
		
	}

}
