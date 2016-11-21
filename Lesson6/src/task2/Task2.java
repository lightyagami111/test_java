package task2;

public class Task2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, { 2, 3, 4, 5 } };

		// prints left diagonal
		for (int row = 0, col = 0; row < arr.length; row++, col++) {
			System.out.print(arr[row][col] + " ");

			if (row == arr.length - 1 && col == arr[row].length - 1) {
				System.out.println();
			}

		}

		// prints right diagonal
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if ((row + col) == arr.length - 1) {
					System.out.print(arr[row][col] + " ");
				}
			}

		}
	}

}
