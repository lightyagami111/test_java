package addTask8;

public class AddTask8 {

	public static void main(String[] args) {
		boolean[][] arr = { { false, false, false, false, true }, { false, false, false, false, true },
				{ false, false, false, false, true }, { false, false, false, true, true },
				{ false, true, false, true, false } };

		boolean isFoundTrue = false;

		// елементи на обратния диагонал
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row + col < arr.length - 1) {
					if (arr[row][col] == true) {
						isFoundTrue = true;
						break;
					}
				}
			}

		}

		// print result
		System.out.println(isFoundTrue ? "съдържа стойност true" : "не съдържа стойност true");

	}

}
