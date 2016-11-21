package task18;

public class Task18 {

	public static void main(String[] args) {

		int[] arr1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };

		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

		int count = arr1.length < arr2.length ? arr1.length : (arr1.length == arr2.length ? arr1.length : arr2.length);

		int[] maxArr = new int[count];

		for (int i = 0; i < count; i++) {
			if (arr1[i] > arr2[i]) {
				maxArr[i] = arr1[i];
			} else {
				maxArr[i] = arr2[i];
			}
		}

		// print result
		for (int i = 0; i < maxArr.length; i++) {
			System.out.print(maxArr[i] + " ");
		}

	}

}
