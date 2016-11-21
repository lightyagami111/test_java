package task7;

public class Task7 {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int rowSum = 0;
		int totalSum = 0;

		for (int row = 0, col = 0; row < arr.length;) {
			if (col < arr.length) {
				if ((row + col) % 2 == 0) {
					System.out.print(arr[row][col] + " ");
					rowSum += arr[row][col];
				}
				col++;
			} else {
				System.out.print("сума от елементите за реда: " + rowSum);
				System.out.println();
				totalSum += rowSum;
				rowSum = 0;
				row++;
				col = 0;
			}

		}

		System.out.println("Обща сума: " + totalSum);
	}

}
