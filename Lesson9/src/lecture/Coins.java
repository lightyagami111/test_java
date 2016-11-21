package lecture;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		String coin = "";

		do {
			System.out.print("Моля, въведете ези или тура?");
			coin = scanner.nextLine();

			if (coin.equals("ези")) {
				counter++;
			} else {
				counter = 0;
			}

		} while (counter < 5 || !coin.equals("ези") || !coin.equals("тура"));

		System.out.println("--------- КРАЙ ----------");

		scanner.close();
	}

}
