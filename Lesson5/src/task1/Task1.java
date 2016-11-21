package task1;

import java.util.Scanner;

public class Task1 {

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

		int min = arr[0];
		// operations
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] < min) {
				min = arr[i];
			}
		}

		// print result
		System.out.println("Най-малкото число кратно на 3 е: " + min);
		sc.close();
	}

}
