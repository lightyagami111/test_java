package task14;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n: ");
		int number = scanner.nextInt();
		
		if (number > 200 || number < 10) {
			System.out.println("Невалидни данни.");
		}else {
			for(int i = number; i >0; i--) {			
				if (i % 7 == 0 && i < number) {
					System.out.print(i + " ");
				}			
			}
		}
		
		scanner.close();		
	}

}
