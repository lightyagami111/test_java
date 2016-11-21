package task9;

import java.util.Scanner;

public class Task9b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Please enter a positive number of cells: ");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];

		// reading array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];

			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		// проверка за обръщане на елементите на масива
		/**
		 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + "
		 * "); }
		 **/

		// отпечатваме масива в нормален ред
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
