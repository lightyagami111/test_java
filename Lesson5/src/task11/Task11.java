package task11;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];

		int count = 0;

		// reading array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				count++;
				System.out.print(arr[i] + " ");
			}

			if (i == arr.length - 1) {
				System.out.print("- " + count + " числа");
			}
		}

		sc.close();

	}

}
