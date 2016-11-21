package task8;

public class Task8 {

	public static void main(String[] args) {

		int[] arr = { 18, 4, 4, 4, 4, 4, 4, 4, 4, 4, 33, 33, 33, 33, 5, 5, 5, 5, 5, 5, };

		int maxElement = arr[0];
		int maxCount = 0;

		int tempCount = 1;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				tempCount++;

				if (tempCount > maxCount) {
					maxCount = tempCount;
					maxElement = arr[i];
				}
			} else {
				tempCount = 1;
			}

		}

		for (int i = 1; i <= 9; i++) {
			System.out.print(maxElement + " ");
		}

		// System.out.println("max count: " + maxCount);
		// System.out.println("max element: " + maxElement);

	}

}
