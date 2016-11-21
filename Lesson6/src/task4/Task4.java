package task4;

public class Task4 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] arr2 = new int[arr1.length][arr1.length];

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				arr2[col][row] = arr1[arr1.length - row - 1][col];
			}
		}

		// print arr2
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}

	}

}
