package lection;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 3, 8, 1, 4, 5 };
		// min = 0
		// j = 2
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {

		for (int k = 0; k < arr.length - 1; k++) {
			int min = arr[k];
			int minIndex = k;

			for (int i = k + 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}

			int temp = arr[k];
			arr[k] = arr[minIndex];
			arr[minIndex] = temp;

		}

	}

}
