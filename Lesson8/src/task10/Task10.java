package task10;

public class Task10 {

	public static void main(String[] args) {

		String text1 = "Hello";

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < text1.length(); i++) {
			output.append((char) (text1.codePointAt(i) + 5));
		}

		System.out.println(output);

	}

}
