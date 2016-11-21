package task10;

public class Task10 {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 6, 6, 5, 1, 7 };

		// input1: 8, 4, 6, 5, 5, 1, 7 --> 5
		// input2: 8, 4, 6, 14, 5, 1, 17 --> 17
		// input3: 8, 4, 6, 1, 5, 1, 7 --> 1
		// input4: 8, 4, 6, -10, 5, 1, 7 --> 1
		// input5: 8, 4, 6, 6, 5, 1, 7 --> 6
		// input6: 8, 4, 1, 6, 5, 1, 7 -->5

		int midValue = arr[(arr.length - 1) / 2];
		// System.out.println("middle value: " + midValue);

		int dest = 0;
		int min = arr[0] - midValue;

		if (min < 0) {
			min = -min;
		}

		int minPos = 0;

		for (int i = 0; i < arr.length; i++) {

			dest = arr[i] - midValue;

			if (dest < 0) {
				dest = -dest;
			}

			if (i == (arr.length - 1) / 2) {
				continue;
			}

			if (dest < min) {
				min = dest;
				minPos = i;
			}

		}

		// System.out.println(min);
		System.out.println("най-близка стойност: " + arr[minPos] + " на позиция: " + minPos);

	}

}
