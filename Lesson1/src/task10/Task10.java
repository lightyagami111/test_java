package task10;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bucket2 = 2;
		int bucket3 = 3;
		
		int volume = scanner.nextInt(); // 51

		int countTotal = volume / (bucket2 + bucket3);
		int count2 = countTotal;
		int count3 = countTotal;
		
		// bucketAdd = 1
		int bucketAdd =  volume - (countTotal*bucket2 + countTotal *bucket3);
		
		if (bucketAdd > bucket2 || bucketAdd > bucket2) {
			System.out.println("допълнително кофа от " + bucketAdd+ " литра,");
		}
				
		if (bucketAdd == 1) {
			--count2;
		}
		else {
			--count3;
		}
		
		System.out.println(count2  + " пъти по " + bucket2 + " литра");
		System.out.println(count3  + " пъти по " + bucket3 + " литра");
		
		scanner.close();
	}

}
