package lection;

import java.util.Scanner;

public class ArrayExamples2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("Please enter a positive number of cells: ");
			n = sc.nextInt();

		} while (n <= 0);

		int[] arr = new int[n];

		int min = arr[0];
		int max = arr[0];

		// fill array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}

		// find min/max element in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// print array
		System.out.println("--------------------------------");
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		System.out.println("--------------------------------");

		System.out.println("max element: " + max);
		System.out.println("min element: " + min);

		sc.close();

	}

}
