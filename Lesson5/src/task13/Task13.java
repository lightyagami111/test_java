package task13;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter decimal number: ");
		int num = sc.nextInt();

		int result = 0;
		int power = 1;
		int counter = 0;

		do {
			int ostatuk = num % 2;
			counter++;
			num /= 2;

			result = result + ostatuk * power;
			power *= 10;

		} while (num > 0);

		int[] arr = new int[counter];

		int pow = 1;
		int product = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result % 10;
			result /= 10;

			product = product + arr[i] * pow;
			pow *= 10;

		}

		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}

		sc.close();
	}

}
