package addTask6;

public class AddTask6 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 1, 2, 5, 3, 7 }, { 4, 0, 6, 3, 8 },
				{ 9, 7, 9, 1, 6 } };

		// елементи на обратния диагонал
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row + col == arr.length - 1) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}

		System.out.println();

		// елементи на главния диагонал
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row == col) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}

	}

}
