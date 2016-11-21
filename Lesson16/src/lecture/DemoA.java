package lecture;

public class DemoA {

	public static void main(String[] args) {
		A a1 = new A(2, 3);
		A a2 = new A(7, 9);

		a2.y++; // a2.y = 10
		a1.x += a2.y;
		System.out.println(a1.x); // a1.x = 17

		a2.y = a1.y - 1; // a2.y = 2
		System.out.println(a2.y);

	}

}
