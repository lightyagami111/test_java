package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter n: ");
		int n = sc.nextInt();

		long[] arr = new long[10];

		for (int i = 0; i < arr.length; i++) {
			while (i <= 1) {
				arr[i] = n;
				i++;
			}
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
