package lecture;

public class FindNumInArray {

	public static void main(String[] args) {
		int x = 9;

		int[] arr = { 12, 8, 9, 4, 3, 6, 18 };

		// boolean checkX = findX(arr, x);
		boolean checkXRec = findXRec(arr, x, 0);

		System.out.println(checkXRec);

	}

	// without recursion
	public static boolean findX(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}

		return false;
	}

	// with recursion
	public static boolean findXRec(int[] arr, int x, int index) {

		if (index >= arr.length - 1) {
			return false;
		}

		if (arr[index] == x) {
			return true;
		} else {
			findXRec(arr, x, ++index);
		}

		return false;
	}

}
