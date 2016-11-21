package addTask10;

public class AddTask10 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 1, 1, 1, 2, 4, 9, 3 };

		int tempCount = 1;
		int maxCount = 0;

		int element = 0;

		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					tempCount++;
				}

				if (tempCount > maxCount) {
					maxCount = tempCount;
					element = arr[i];
				}

			}

			tempCount = 1;

		}

		System.out.println(element + " (" + maxCount + " times)");
	}

}
