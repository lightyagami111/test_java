package task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a: ");
		int a = sc.nextInt();

		System.out.print("b: ");
		int b = sc.nextInt();

		System.out.print("c: ");
		int c = sc.nextInt();

		// binary number
		System.out.println("in binary: " + Integer.toBinaryString(a));

		a = a ^ (1 << b);
		a = a ^ (1 << c);

		System.out.println("------------------------");
		System.out.println(a);
		// binary number
		System.out.println("in binary: " + Integer.toBinaryString(a));

	}

}
