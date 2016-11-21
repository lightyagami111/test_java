package task2;

import java.util.Scanner;

public class Task2 {

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

		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i <= (arr.length - 1) / 2) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[arr.length - i - 1];
			}
		}

		// printing array
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

		sc.close();
	}

}
