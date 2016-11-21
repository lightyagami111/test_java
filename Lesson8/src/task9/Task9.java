package task9;

public class Task9 {

	public static void main(String[] args) {

		String input = "14asd-126sdf45-56asdf100";

		int sum = 0;

		int number = 0;

		StringBuilder text = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			if (i == 0 && Character.isDigit(input.charAt(0))) {
				text.append(input.charAt(0));
			}

			else if (i != 0 && Character.isDigit(input.charAt(i))) {
				if (input.charAt(i - 1) == '-') {
					text.append(input.charAt(i - 1));
				}
				text.append(input.charAt(i));
			}

			// check sum
			if (i != 0 && Character.isDigit(input.charAt(i - 1)) && !Character.isDigit(input.charAt(i))) {
				System.out.println(text);
				sum += Integer.parseInt(text.toString());
				text.setLength(0);
			} else if (i == input.length() - 1 && Character.isDigit(input.charAt(i))) {
				System.out.println(text);
				sum += Integer.parseInt(text.toString());
			}

		}

		System.out.println("Total sum: " + sum);
	}

}
