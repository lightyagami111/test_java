package lecture;

public class WordCounter {

	public static void main(String[] args) {

		String sentence = "imalo edno edno vreme na na na na zapad";

		String[] words = sentence.split(" ");

		int tempCount = 1;
		int maxCount = 0;
		int index = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					tempCount++;
				}

			}

			if (tempCount > maxCount) {
				maxCount = tempCount;
				index = i;
			}

			tempCount = 1;
		}

		System.out.println("Най-често срещаната дума е: '" + words[index] + "', среща се: " + maxCount + " пъти");

	}

}
