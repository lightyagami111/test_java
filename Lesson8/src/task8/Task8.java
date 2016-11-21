package task8;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвежда ред от символи (стринг, низ).
 * Програмата да изведе на екрана дали въведения стринг е палиндром, т.е. дали
 * четен отляво-надясно и отдясно-наляво е един и същ.
 * 
 * Вход: капак Изход: да.
 * 
 * Вход: тенджера Изход: не.
 * 
 * @author Ramona
 *
 */

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		do {
			System.out.print("Моля въведете дума: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		boolean isPalindrome = true;

		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		System.out.println(isPalindrome ? "палиндром" : "не е палиндром");

		sc.close();
	}

}
