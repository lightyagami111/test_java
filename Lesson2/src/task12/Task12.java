package task12;

public class Task12 {

	public static void main(String[] args) {

		for (int i = 102; i <= 987; i++) {
			int firstNum = i / 100;
			int secondNum = (i / 10) % 10;
			int thirdNum = i % 10;

			if (firstNum == secondNum || secondNum == thirdNum || firstNum == thirdNum) {
				continue;
			}else {
				System.out.print(i + " ");
			}
			
		}

	}

}
