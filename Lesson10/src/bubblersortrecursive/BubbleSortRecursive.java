package bubblersortrecursive;

import java.util.Arrays;

public class BubbleSortRecursive {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 2, 8 }; // test2: 5, 1, 4, 2, 8
		bubbleSortRecursive(arr, 0, 0, false);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSortRecursive(int[] arr, int i, int j, boolean sorted) {

		if (i == arr.length - 1) {
			sorted = true;
		}

		if (j == arr.length - 1 - i) {
			bubbleSortRecursive(arr, ++i, j = 0, sorted);
		}

		if (sorted) {
			return;
		}

		if (arr[j] > arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
			bubbleSortRecursive(arr, i, ++j, sorted);
		} else {
			bubbleSortRecursive(arr, i, ++j, sorted);
		}

	}

}
