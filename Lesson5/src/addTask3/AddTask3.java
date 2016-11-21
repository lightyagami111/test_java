package addTask3;

public class AddTask3 {

	public static void main(String[] args) {

		int[] array = { 18, 5, 6, 12, 3, 5, 11 };

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) // swap items
				{
					int tmp = array[i];
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
