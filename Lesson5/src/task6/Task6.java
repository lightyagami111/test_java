package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// arr1 -------------------------------------------
		int n1;
		do {
			System.out.print("Please enter a positive number of cells for arr1: ");
			n1 = sc.nextInt();
		} while (n1 <= 0);

		int[] arr1 = new int[n1];

		// reading arr1
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr1[i] = sc.nextInt();
		}

		// arr2 ------------------------------------------

		int n2;
		do {
			System.out.print("Please enter a positive number of cells for arr1: ");
			n2 = sc.nextInt();
		} while (n2 <= 0);

		int[] arr2 = new int[n2];

		// reading arr2
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr2[i] = sc.nextInt();
		}

		// check for equal arrays
		boolean isEqual = true;

		if (n1 == n2) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		} else {
			isEqual = false;
		}

		System.out.println(isEqual ? "equal" : "not equal");
		System.out.println((n1 == n2) ? "equal lenght" : "not equal length");

		sc.close();

	}

}
