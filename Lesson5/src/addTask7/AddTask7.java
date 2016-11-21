package addTask7;

public class AddTask7 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 1, 2, 5, 3, 7 }, { 4, 6, 6, 3, 8 },
				{ 9, 7, 9, 1, 6 } };

		int product = 1;

		// елементи на главни€ диагонал
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row > col) {
					product *= arr[row][col];
				}
			}
		}

		System.out.println("ѕроизведението е: " + product);

	}

}
