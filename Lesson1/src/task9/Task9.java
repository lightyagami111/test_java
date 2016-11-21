package task9;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a = ");
		int a = scanner.nextInt();

		System.out.print("b = ");
		int b = scanner.nextInt();

		int result = a * b;
		int lastDigit = result% 10;
		
		boolean isEven = true;
		
		if (lastDigit % 2 != 0) {
			isEven = false;
		}
		
		if (isEven) {
			System.out.println(result + ", " + lastDigit + " четна");
		}else {
			System.out.println(result + ", " + lastDigit + " нечетна");
		}
		

		scanner.close();
		
	}

}
