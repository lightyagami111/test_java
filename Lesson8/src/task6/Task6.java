package task6;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвежда изречение с отделни думи. Като
 * резултат на екрана да се извежда същия текст, но всяка отделна дума да
 * започва с главна буква, а следващите я букви да са малки.
 * 
 * Пример: супер яката задача
 * 
 * Изход: Супер Яката Задача
 * 
 * @author Ramona
 *
 */

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		do {
			System.out.print("Въведете изречение: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		for (int i = 0; i < input.length(); i++) {
			if (i == 0 || input.charAt(i - 1) == ' ') {
				System.out.print(input.toUpperCase().charAt(i));
			} else {
				System.out.print(input.charAt(i));
			}
		}

		sc.close();
	}

}
