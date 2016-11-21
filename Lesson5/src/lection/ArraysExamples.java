package lection;

import java.util.Scanner;

public class ArraysExamples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("Please enter a positive number of cells: ");
			n = sc.nextInt();

			//
		} while (n <= 0);

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
