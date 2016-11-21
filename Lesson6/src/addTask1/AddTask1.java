package addTask1;

public class AddTask1 {

	public static void main(String[] args) {
		int[][] arr1 = { { 11, 20, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int tempSum = 0;
		int maxSum = 0;

		int maxRowNum = 0;

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				tempSum += arr1[row][col];
			}

			if (tempSum > maxSum) {
				maxSum = tempSum;
				maxRowNum = row;
			}
			tempSum = 0;
		}

		System.out.println("max sum: " + maxSum + " at row: " + maxRowNum);
	}

}
