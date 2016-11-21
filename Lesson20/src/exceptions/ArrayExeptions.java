package exceptions;

public class ArrayExeptions {

	private static void printArrayInfo(int[] arr) {

		if (arr != null) {
			// prints array length
			System.out.println("array length is : " + arr.length);

			if (arr.length >= 3) {
				// prints the third element
				System.out.println("the third element of array length is : " + arr[2]);
			}

			// prints some text
			System.out.println("Lalalal");
		}

	}

	public static void main(String[] args) {

		int[] array = { 6, 8, 11, 5, 29 };

		try {
			printArrayInfo(array);
		} catch (NullPointerException e) {
			System.out.println("Something is null.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds.");
		}
	}

}
