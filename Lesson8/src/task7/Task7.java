package task7;

import java.util.Scanner;

/**
 * Да се състави програма, която чете набор от думи разделени с интервал. Като
 * резултат да се извеждат броя на въведените думи, както и броя знаци в
 * най-дългата дума.
 * 
 * Пример: asd fg hjkl Изход: 3 думи, най-дългата е с 4 символа
 * 
 * @author Ramona
 *
 */

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		do {
			System.out.print("Моля въведете набор от думи разделени с интервал: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		String[] words = input.split(" ");
		int counter = words.length;

		int maxLength = 0;
		String longestWord = null;

		int tempLength = 0;

		for (int i = 0; i < words.length; i++) {

			tempLength = words[i].length();

			if (tempLength > maxLength) {
				maxLength = tempLength;
				longestWord = words[i];
			}
		}

		System.out.println(counter + " думи. Най-дългата е '" + longestWord + "' с " + maxLength + " символа.");

		sc.close();
	}

}
