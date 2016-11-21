package task11;

public class Task11 {

	public static void main(String[] args) {
		Integer[] arr1 = { 14, 7, 29, 1, -55 };
		Character[] arr2 = { 'm', 'l', 'f', 'k' };

		Object[] arrObj = arr2;

		printArray(arrObj);
	}

	public static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + " ");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
