package lecture;

public class Stars {

	public static void main(String[] args) {

		int rows = 5;
		int zvezdichki = 1;

		for (int row = 1; row <= rows; row++) {
			// print rows - row number of spaces
			for (int i = 1; i <= rows - row; i++) {
				System.out.print(" ");
			}

			for (int x = 1; x <= zvezdichki; x++) {
				System.out.print("*");
			}

			System.out.println();
			zvezdichki += 2;
		}

	}

}
