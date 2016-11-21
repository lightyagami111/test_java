package task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 5;

		String text1 = null; // 9
		String text2 = null;

		do {
			System.out.println("Please enter text1: ");
			text1 = sc.nextLine();
		} while (text1.length() < 10 || text1.length() > 20);

		do {
			System.out.println("Please enter text2: ");
			text2 = sc.nextLine();
		} while (text2.length() < 10 || text2.length() > 20);

		char[] replacement = new char[n];
		char[] target = text1.toCharArray();

		text2.getChars(0, n, replacement, 0);

		for (int i = 0; i < replacement.length; i++) {
			target[i] = replacement[i];
		}

		System.out.print(target.length > text2.length() ? target.length + " " : text2.length() + " ");
		System.out.println(target); // uchenishe

		sc.close();
	}
}
