package task3;

public class Task3 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 4 }, { 5, 9 }, { 4, 8 }, { 2, 3 } };

		int sum = 0;
		int count = 0;

		float averageAritmetic = 0.0f;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				count++;
			}
		}

		System.out.println("sum: " + sum);
		System.out.println("average arithmetic: " + (float) sum / count);
	}

}
