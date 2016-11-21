package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text1;
		String text2;

		do {
			System.out.print("Please enter text1: ");
			text1 = sc.nextLine();

		} while (text1.length() < 1 || text1.length() > 40);

		do {
			System.out.print("Please enter text1: ");
			text2 = sc.nextLine();

		} while (text1.length() < 1 || text1.length() > 40);

		String[] strArr = generateArray(text1, text2);

		String resultedString = concatTransform(strArr);

		// print result
		System.out.println(resultedString);

		sc.close();
	}

	public static String[] generateArray(String text1, String text2) {
		String[] strArr = new String[4];

		for (int i = 0; i < strArr.length; i++) {
			if (i <= 1) {
				strArr[i] = text1;
			} else {
				strArr[i] = text2;
			}
		}

		return strArr;
	}

	public static String concatTransform(String[] str) {

		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0) {
				str[i] = str[i].toUpperCase().concat(" ");
			} else {
				str[i] = str[i].toLowerCase().concat(" ");
			}
		}

		String concated = Arrays.toString(str);

		return concated;

	}

}
