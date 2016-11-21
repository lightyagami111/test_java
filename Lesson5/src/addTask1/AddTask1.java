package addTask1;

import java.util.Scanner;

public class AddTask1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Please enter a positive number of cells: ");
			n = sc.nextInt();
		} while (n <= 3);

		int[] arr = new int[n];

		boolean allPosssitive = true;

		// reading array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + (i + 1) + "]: ");
			arr[i] = sc.nextInt();
		}

		// processing array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				allPosssitive = false;
				break;
			}

		}

		// printing result
		System.out.println(allPosssitive ? "Всички числа са неотрицателни." : "Не всички числа са неотрицателни.");

		sc.close();
	}

}
