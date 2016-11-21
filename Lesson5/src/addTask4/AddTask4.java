package addTask4;

import java.util.Arrays;

public class AddTask4 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 1, 0 };

		int zeroesCount = 0;

		// find zeros and ones count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroesCount++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < zeroesCount) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

		// print array
		System.out.println(Arrays.toString(arr));

		int[][] table = { { 4, 5, 6, 7 }, { 3, 3, 1, 3 }, { 1, 2, 8, 8 } };

		System.out.print(Arrays.deepToString(table));

	}

}
