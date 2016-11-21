package addTask11;

public class AddTask11d {

	public static void main(String[] args) {

		int n = 4;
		int m = 5;

		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		// int[][] arr2 = {
		// { 1, 8, 9, 16, 17 },
		// { 2, 7, 10, 15, 18 },
		// { 3, 6, 11, 14, 19 },
		// { 4, 5, 12, 13, 20}

		int num = 1;
		for (int row = 0; row < m; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < n; col++) {
					arr2[col][row] = num++;
				}
			} else {
				for (int col = n - 1; col >= 0; col--) {
					arr2[col][row] = num++;
				}
			}
		}

		// print result
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}

	}

}
