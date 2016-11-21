package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		char separator = ',';
		boolean separatorFound = true;

		do {
			System.out.print("Моля въведете две имена разделени с '" + separator + "': ");
			input = sc.nextLine();

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == separator) {
					separatorFound = false;
				}
			}

		} while (separatorFound);

		String[] names = input.split(separator + " ", 2);

		int codesFirstName = 0;
		int codesSecondName = 0;

		names[0] = names[0].trim();
		names[1] = names[1].trim();

		for (int i = 0; i < names[0].length(); i++) {
			if (names[0].charAt(i) == separator || names[0].charAt(i) == ' ') {
				continue;
			} else {
				codesFirstName += names[0].charAt(i);
			}

		}

		for (int i = 0; i < names[1].length(); i++) {
			if (names[1].charAt(i) == separator || names[1].charAt(i) == ' ') {
				continue;
			} else {
				codesSecondName += names[1].charAt(i);
			}

		}

		if (codesFirstName > codesSecondName) {
			System.out.println(names[0] + "sum: " + codesFirstName);
		} else if (codesSecondName > codesFirstName) {
			System.out.println(names[1]);
		} else {
			System.out.println("Двете имена имат еднаква сума от ASCII кодове.");
		}

		sc.close();

	}

}
