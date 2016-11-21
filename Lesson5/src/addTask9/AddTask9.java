package addTask9;

public class AddTask9 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 1, 2, 5, 3, 7 }, { 4, 6, 6, 3, 8 },
				{ 9, 7, 9, 1, 6 } };

		int tempSum = 0;
		int maxSum = 0;

		int maxRow = 0;
		int maxCol = 0;

		for (int row = 0; row < arr.length - 1; row++) {
			for (int col = 0; col < arr[row].length - 1; col++) {
				tempSum = arr[row][col] + arr[row][col + 1] + arr[row + 1][col] + arr[row + 1][col + 1];

				if (tempSum > maxSum) {
					maxSum = tempSum;
					maxRow = row;
					maxCol = col;
				}

			}

		}

		System.out.println("max sum: " + maxSum + "\nmatrix [" + arr[maxRow][maxCol] + ", " + arr[maxRow][maxCol + 1]
				+ "," + arr[maxRow + 1][maxCol] + ", " + arr[maxRow + 1][maxCol + 1] + "]");

	}

}
