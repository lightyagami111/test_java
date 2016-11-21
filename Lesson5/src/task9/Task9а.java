package task9;

import java.util.Scanner;

public class Task9а {

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

		int[] arrAdd = new int[arr.length];

		// елементите на масива се обръщат в обратен ред
		for (int i = 0; i < arr.length; i++) {
			arrAdd[i] = arr[arr.length - i - 1];
		}

		// отпечатваме масива в нормален ред
		for (int i = arrAdd.length - 1; i >= 0; i--) {
			System.out.print(arrAdd[i] + " ");
		}

		sc.close();
	}

}
