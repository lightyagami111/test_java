package task13;

import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 4 };

		int[] resArr = concatArray(arr1, arr2);
		System.out.println(Arrays.toString(resArr));

	}

	public static int[] concatArray(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];

		int j = 0;

		for (int i = 0; i < result.length; i++) {
			if (i < arr1.length) {
				result[i] = arr1[i];
			} else {
				result[i] = arr2[j];
				j++;
			}
		}

		return result;
	}

}
