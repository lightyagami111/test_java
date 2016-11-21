package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();

		int swap = a1;
		a1 = a2;
		a2 = a3;
		a3 = swap;

		System.out.println("::[" + a1 + ", " + a2 + ", " + a3 + "]::");

		scanner.close();

	}

}
