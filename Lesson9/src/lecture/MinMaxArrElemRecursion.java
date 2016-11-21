package lecture;

public class MinMaxArrElemRecursion {

	public static void main(String[] args) {
		int[] arr = { 6, 18, 3, 1, 55 };

		int max = findMax(arr, 1, arr[0]);
		System.out.println("max: " + max);

		int min = findMin(arr, 1, arr[0]);
		System.out.println("min: " + min);

		int razlika = findRazlika(arr, 1, arr[0], arr[0]);
		System.out.println("razlika: " + razlika);
	}

	static int findMax(int[] arr, int index, int max) {
		if (index == arr.length) {
			return max;
		}

		if (arr[index] > max) {
			max = arr[index];
		}
		return findMax(arr, ++index, max);

	}

	static int findMin(int[] arr, int index, int min) {

		if (index == arr.length) {
			return min;
		}

		if (arr[index] < min) {
			min = arr[index];
		}

		return findMin(arr, ++index, min);

	}

	static int findRazlika(int[] arr, int index, int max, int min) {

		if (index == arr.length) {
			return max - min;
		}

		if (arr[index] > max) {
			max = arr[index];
		}

		if (arr[index] < min) {
			min = arr[index];
		}

		return findRazlika(arr, ++index, max, min);

	}

}
