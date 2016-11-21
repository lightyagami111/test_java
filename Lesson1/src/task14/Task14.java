package task14;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int position1 = scanner.nextInt();
		int position2 = scanner.nextInt();
		int position3 = scanner.nextInt();
		int position4 = scanner.nextInt();

		boolean isEvenPos1 = position1 % 2 == 0;
		boolean isEvenPos2 = position2 % 2 == 0;
		boolean isEvenPos3 = position3 % 2 == 0;
		boolean isEvenPos4 = position4 % 2 == 0;

		if ((isEvenPos1 && !isEvenPos4) || (!isEvenPos1 && isEvenPos4)) {
			if ((isEvenPos2 && !isEvenPos3) || (!isEvenPos2 && isEvenPos3)) {
				System.out.println("Позициите са с еднакъв цвят.");
			} else {
				System.out.println("Позициите са с различен цвят.");
			}
		}

		if ((isEvenPos1 && isEvenPos4) || (!isEvenPos1 && !isEvenPos4)) {
			if ((isEvenPos2 && isEvenPos3) || (!isEvenPos2 && !isEvenPos3)) {
				System.out.println("Позициите са с еднакъв цвят.");
			} else {
				System.out.println("Позициите са с различен цвят.");
			}
		}

		scanner.close();

	}

}
