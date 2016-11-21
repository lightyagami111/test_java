package task3;

public class Task3 {

	public static void main(String[] args) {
		int number = 1256;
		String numStr = Integer.toString(number);
		int[] arr = new int[numStr.length()];

		intToArrRec(0, numStr, arr);

		System.out.println(isPalindromeRec(arr, 0, true));

	}

	public static int[] intToArrRec(int i, String numStr, int[] arr) {

		if (i == numStr.length() - 1) {
			arr[i] = numStr.charAt(i) - '0';
			return arr;
		} else {
			arr[i] = numStr.charAt(i) - '0';
			return intToArrRec(++i, numStr, arr);
		}

	}

	public static boolean isPalindrome(int[] arr) {
		boolean isPalindrome = true;

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				isPalindrome = false;
			}
		}

		return isPalindrome;
	}

	public static boolean isPalindromeRec(int[] arr, int i, boolean isPalindrome) {

		if (i >= arr.length - 1) {
			return isPalindrome;
		}

		if (arr[i] == arr[arr.length - i - 1]) {
			return isPalindromeRec(arr, ++i, isPalindrome);
		} else if (arr[i] != arr[arr.length - i - 1]) {
			isPalindrome = false;

		}

		return isPalindrome;
	}

}
