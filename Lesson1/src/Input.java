import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter value for sideA of square: ");	
		int sideA = scanner.nextInt();
		
		System.out.print("Please enter value for sideA of square: ");	
		int sideB = scanner.nextInt();
		
		if (sideA>0 && sideB>0) {
			System.out.println("Correct data!");
			
			int size = sideA * sideB;	
			System.out.println("The size is: " + size);
		}else {
			System.out.println("Please enter correct data.");
		}
		
		scanner.close();

		
	}
}
