package task20;

public class Task20 {

	public static void main(String[] args) {

		for (int row = 1; row <= 10; row++) {
			for (int col = row, count = 1; col <= 10 && count <= 10; col++, count++) {
				if (col >= 10) {
					col = 0;
					System.out.print(col + " ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.println();
		}

	}

}
