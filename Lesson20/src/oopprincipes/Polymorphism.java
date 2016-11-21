package oopprincipes;

public class Polymorphism {

	int add(int a) {
		return a;
	}

	int add(int a, int b) {
		return a + b;
	}

	int add(float a, float b) {
		return (int) (a + b);
	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(8, 18); // <-- compile time polymorphism
	}

}
