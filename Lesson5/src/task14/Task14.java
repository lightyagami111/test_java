package task14;

public class Task14 {

	public static void main(String[] args) {

		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };

		// int count = 0;
		double[] newArr = new double[arr.length];

		// елементи от масива със стойности от интервала [-2.99..2.99]
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] < 2.99) {
				newArr[i] = arr[i];
			}
		}

		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] != 0) {
				System.out.print(newArr[i] + " ");
			}
		}

	}

}
