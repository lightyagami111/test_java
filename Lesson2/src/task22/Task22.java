package task22;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Âúâåäåòå ÷èñëî îò èíòåğâàëà [1..999]: ");
		int number = scanner.nextInt();
		
		int n = 1;
		int j = number+1;
		int count = 1;
		
		if (number >=1 && number <= 999) {
			while(count < 11) {
				if (j % 2 == 0 || j % 3 == 0 || j % 5 == 0) {
					count++;			
					System.out.print(n + ":" + j + ", ");
					n++;
				}
				
				j++;
				
			}
		}else {
			System.out.println("Íåâàëèäíè âõîäíè äàííè.");
		}
			
		scanner.close();
	}

}
