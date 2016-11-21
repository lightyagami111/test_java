package task23;

public class Task23 {

	public static void main(String[] args) {

		for (int row = 1; row <= 9; row++) {
			for (int col = row; col <= 9; col++) {
				System.out.print(row + "*" + col + " ");
			}
			System.out.println();
		}

	}

}
