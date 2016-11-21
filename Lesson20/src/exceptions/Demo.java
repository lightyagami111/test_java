package exceptions;

public class Demo {

	public static void main(String[] args) {
		try {
			Person pesho = new Person();
			Person katia = new Person("kateto");

			// pesho.hasTheSameName(katia); // NullPointerException

			int[] arr = { 1, 2, 3 };
			System.out.println(arr[123]);

		} catch (NullPointerException e) {
			System.out.println("Someone has no name." + e.getClass().getName());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong operation with an array");
			System.out.println(e.getMessage());
		}

		System.out.println("End---------");

	}

}
