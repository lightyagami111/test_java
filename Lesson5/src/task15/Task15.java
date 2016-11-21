package task15;

public class Task15 {

	public static void main(String[] args) {

		double[] array = { 7.13, 0.2, 4.9, 5.1, 6.34, 1.12 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] < array[j]) // swap items
				{
					double tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

		// printing result
		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
