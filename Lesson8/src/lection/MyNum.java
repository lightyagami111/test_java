package lection;

public class MyNum {

	public static void main(String args[]) {

		String sentence = "Java Concept Of The Day";

		String[] words = sentence.split(" ");

		String reveresdSentenc = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}

			// apending revWord to reversed string
			reveresdSentenc += revWord + "  ";

		}

		System.out.println(reveresdSentenc);
	}

}
