package task5;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвеждат 2 редици от знаци (думи). Ако
 * в двете редици участва един и същи знак, да се изведе на екрана първата
 * редица хоризонтално, а втората вертикално, така че да се пресичат в общия си
 * знак. Ако редиците нямат общ знак да се изведе само уведомително съобщение.
 * 
 * Пример:
 *  м
 *  а
 *  шапка
 *  и
 *  н
 *  а
 * 
 * @author Ramona
 *
 */

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word1;
		String word2;

		// reading words
		do {
			System.out.print("Въведете първата дума: ");
			word1 = sc.nextLine().trim();
		} while (word1.isEmpty());

		do {
			System.out.print("Въведете втората дума: ");
			word2 = sc.nextLine().trim();
		} while (word2.isEmpty());

		boolean foundSameChar = false;
		int index = 0;

		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(0)) {
				foundSameChar = true;
				index = i;
				break;
			}
		}

		// print words
		if (foundSameChar) {
			for (int i = 0; i < word1.length(); i++) {
				if (i != index) {
					System.out.println(word1.charAt(i));
				} else if (i == index) {
					System.out.println(word2);
				}

			}
		} else {
			System.out.println("Редиците нямат общ знак.");
		}

		sc.close();
	}

}
