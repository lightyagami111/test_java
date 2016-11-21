package lection;

public class StringExamples2 {

	public static void main(String[] args) {
		/**
		 * Операции със стрингове:
		 * 
		 * стринговете са неизменими, т.е. immutable - всяка промяна върху
		 * стринга, води до създаването на новa стойност в heap.
		 * 
		 * - String - референтен тип (стойностите му се съхраняват в heap-a) -
		 * достъп и обхождане на симвоите на даден низ - charAt()
		 */

		String s1 = "Програмирането";

		String text = "Програмирането е изкуство на мисълта";

		boolean index = text.contains(s1);

		StringBuilder sBuilder = new StringBuilder(text);

		sBuilder.insert(0, 28);
		sBuilder.insert(sBuilder.length(), "!"); // sBuilder.append("some
													// text");
		sBuilder.delete(0, 3);
		sBuilder.replace(10, 14, "additional str");
		sBuilder.append("и още текст");

		// Сравнение на стойности от тип StringBuilder
		StringBuilder sb1 = new StringBuilder("Програмирането");
		StringBuilder sb2 = new StringBuilder("Програмирането");

		String textSb1 = sb1.toString();
		String textSb2 = sb2.toString();

		System.out.println("Равни ли са: " + textSb1.equals(textSb2));

		String test1 = new String("test");
		String test2 = new String("test");

		System.out.println(test1 == test2);

	}
}
