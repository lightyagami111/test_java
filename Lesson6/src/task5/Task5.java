package task5;

public class Task5 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }

		};

		int maxRowSum = 0;
		int maxColSum = 0;

		int tempRowSum = 0;
		int tempColSum = 0;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				tempRowSum += arr[row][col];
				tempColSum += arr[col][row];

				if (tempRowSum > maxRowSum) {
					maxRowSum = tempRowSum;
				}

				if (tempColSum > maxColSum) {
					maxColSum = tempColSum;
				}

			}

			tempColSum = 0;
			tempRowSum = 0;

		}

		if (maxRowSum > maxColSum) {
			System.out.println("Максималната сума по редове е > от максималната сума по колони.");
		} else {
			System.out.println("Максималната сума по колони е > от максималната сума по редове.");
		}

	}

}
