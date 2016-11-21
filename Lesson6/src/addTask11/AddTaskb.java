package addTask11;

public class AddTaskb {

	public static void main(String[] args) {

		int n = 4;
		int m = 5;

		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		// int[][] arr2 = {
		// { 1, 5, 9, 13, 17 },
		// { 2, 6, 10, 14, 18 },
		// { 3, 7, 11, 15, 19 },
		// { 4, 8, 12, 16, 20}

		for (n = 0; n < arr1.length; n++) {
			int num = n + 1;
			for (m = 0; m < arr1[n].length; m++) { // m = 0-5
				arr2[n][m] = num;
				num += 4;
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
