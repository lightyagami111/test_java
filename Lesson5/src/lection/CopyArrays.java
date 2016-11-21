package lection;

public class CopyArrays {

	public static void main(String[] args) {

		int[] original = { 3, 5, 3, 5, 6 };

		int[] copy = original;

		int[] realCopy = new int[original.length];

		for (int i = 0; i < original.length; i++) {
			realCopy[i] = original[i];
		}

		// print realCopy
		for (int i = 0; i < realCopy.length; i++) {
			System.out.println(realCopy[i]);
		}
	}

}
