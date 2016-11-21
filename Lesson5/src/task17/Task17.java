package task17;

public class Task17 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 3, 11 };

		boolean isZigZag = true;

		for (int i = 1; i < arr.length; i += 2) {
			if (i != arr.length - 1) {
				if (!(arr[i] > arr[i - 1] && arr[i] > arr[i + 1])) {
					isZigZag = false;
					break;
				}
			}

			if (i == arr.length - 1 && arr[i] <= arr[i - 1]) {
				isZigZag = false;
				break;
			}
		}

		System.out.println(isZigZag ? "зигзагообразна" : "не е зигзагообразна");

	}

}
