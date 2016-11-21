package task10;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число: ");
		int number = scanner.nextInt();

		boolean isSimpleNumber = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isSimpleNumber = false;
			}
		}

		scanner.close();
		System.out.println(isSimpleNumber);
		
	}

}
