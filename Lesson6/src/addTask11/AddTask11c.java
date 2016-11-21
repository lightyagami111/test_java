package addTask11;

public class AddTask11c {

	public static void main(String[] args) {

		int row = 0;
		int col = 1;

		int[][] arr1 = new int[4][5];
		int[][] arr2 = new int[4][5];

		// int[][] arr2 = {
		// { 1, 3, 6, 10, 14 },
		// { 2, 5, 9, 13, 17 },
		// { 4, 8, 12, 16, 19 },
		// { 7, 11, 15, 18, 20}

		int num = 1;
		arr2[0][0] = 1;

		int tempRow = 0;

		// row = 0;
		for (col = row; col < tempRow + 1; ++col) {
			for (row = 1; row < col + 2; row--, tempRow = col) {
				arr2[row][col] = ++num;
			}

		}

		// print result
		for (row = 0; row < arr2.length; row++) {
			for (col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}

	}

}
