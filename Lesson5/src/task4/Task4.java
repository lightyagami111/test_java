package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Please enter a positive number of cells: ");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];

		boolean isSymetric = true;

		// reading array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				isSymetric = false;
				break;
			}
		}

		System.out.println(isSymetric ? "огледален" : "не огледален");
		sc.close();
	}

}
