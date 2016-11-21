package task6;

public class Task6 {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int rowSum = 0;
		int totalSum = 0;

		for (int row = 1; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				if (row % 2 != 0) {
					System.out.print(arr[row][col] + ", ");
					rowSum += arr[row][col];

					if (col == arr[row].length - 1) {
						totalSum += rowSum;
						System.out.println("сума " + rowSum);
					}
				}

			}
			rowSum = 0;
		}

		System.out.println("Сума на елементите: " + totalSum);

	}

}
