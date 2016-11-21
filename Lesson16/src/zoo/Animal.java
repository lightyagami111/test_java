package zoo;

public class Animal {
	protected String name;
	int age;
	double weight;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(String name) {
		this.name = name;
	}

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void makeNoise() {
		System.out.println("Shumul-shumul");
	}

	static void test() {
		System.out.println("test static override");
	}

}
