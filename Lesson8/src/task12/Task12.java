package task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		int n = 0;
		boolean isNotDigit;

		do {
			System.out.print("Въведете размера на масива: ");
			input = sc.nextLine();

			isNotDigit = false;

			for (int i = 0; i < input.length(); i++) {
				if (!Character.isDigit(input.charAt(i))) {
					isNotDigit = true;
					break;
				}
				n = Integer.parseInt(input);
			}

		} while (n <= 0 || isNotDigit);

		int[] arrTest = generateArray(n);

		System.out.println(Arrays.toString(arrTest));

		sc.close();
	}

	public static int[] generateArray(int n) {
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}

		return arr;
	}

}
