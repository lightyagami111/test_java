package addTask11;

public class AddTask11a {

	public static void main(String[] args) {

		int[][] arr1 = new int[4][5];

		int[][] arr2 = new int[4][5];

		// int[][] arr2 = {
		// { 1, 2, 3, 4, 5 },
		// { 6, 7, 8, 9, 10 },
		// { 11, 12, 13, 14, 15 },
		// {16, 17, 18, 19, 20}

		int num = 1;
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				arr2[row][col] = num;
				num++;
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
