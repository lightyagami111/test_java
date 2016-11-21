package zoo;

public class Cat extends Animal {

	public Cat() {

	}

	public Cat(String name) {
		super("Lili");
	}

	void purr() {
		System.out.println("Purr-purr-purr");
	}

	@Override
	void makeNoise() {
		System.out.println("Mquuu-mquuu");
	}

}
