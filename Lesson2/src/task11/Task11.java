package task11;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n: ");
		int rows = scanner.nextInt();
		int zeroes = 0;

		for (int row = 1; row <= rows; row++) {
			// print rows-row spaces
			for (int i = 1; i <= rows - row; i++) {
				System.out.print(" ");
			}

			// first row
			if (row == 1) {
				System.out.print("*");
			}

			if (row > 1 && row < rows) {
				System.out.print("*");
				for (int y = 1; y < zeroes; y++) {
					System.out.print("0");
				}
				System.out.print("*");
			}

			// last row
			if (row == rows) {
				for (int e = 1; e <= rows * 2 - 1; e++) {
					System.out.print("*");
				}
			}

			zeroes += 2;
			System.out.println();
		}

		scanner.close();
		
	}
}
