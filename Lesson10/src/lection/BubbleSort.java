package lection;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 2, 8 };
		System.out.println(Arrays.toString(arr));

		// after sorting
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubblesort(int[] arr) {

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean sorted = true;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				counter++;
				if (arr[j] > arr[j + 1]) {
					sorted = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (sorted) {
				break;
			}

		}

		System.out.println("Операции: " + counter);

	}

}
