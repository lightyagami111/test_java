package lection;

import java.util.Scanner;

public class MultidimensionalArraysEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows;
		int cols;

		do {
			System.out.print("rows: ");
			rows = sc.nextInt();

			System.out.print("cols: ");
			cols = sc.nextInt();

		} while (rows <= 0 || cols <= 0);

		int[][] arr = new int[rows][cols];

		// reading input
		// for (int row = 0; row < arr.length; row++) {
		// for (int col = 0; col < arr[row].length; col++) {
		// System.out.print("arr[" + row + "][" + col + "]: ");
		// arr[row][col] = sc.nextInt();
		// }
		// }

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = 10;
			}
		}

		// writing output
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
