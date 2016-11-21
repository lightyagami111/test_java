package task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("n1 = ");
		int n1 = scanner.nextInt();

		System.out.print("n2 = ");
		int n2 = scanner.nextInt();

		System.out.print("n3 = ");
		int n3 = scanner.nextInt();

		int highest = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
		int lowest = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
		int middle = n1 != highest && n1 != lowest ? n1 : n2 != highest && n2 != lowest ? n2 : n3;

		System.out.printf("%d > %d > %d", highest, middle, lowest);

		scanner.close();

	}

}
