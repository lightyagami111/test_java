package task4;

public class Task4 {

	public static void main(String[] args) {
		String str = "Sony is going to introduce Internet TV";

		System.out.println("original string: " + str);

		// #1 method
		// String reverseStr = new StringBuilder(str).reverse().toString();
		// System.out.println("reverse string: " + reverseStr);

		// #2 method
		String reverseStr = reverseRec(str);
		System.out.println(reverseStr);

	}

	public static String reverse(String str) {
		StringBuilder sBuilder = new StringBuilder();
		char[] letters = str.toCharArray();

		for (int i = letters.length - 1; i >= 0; i--) {
			sBuilder.append(letters[i]);
		}

		return sBuilder.toString();
	}

	public static String reverseRec(String str) {

		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return reverseRec(str.substring(1)) + str.charAt(0);
	}

}
