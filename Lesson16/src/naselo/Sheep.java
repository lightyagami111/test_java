package naselo;

import zoo.Animal;

public class Sheep extends Animal {

	static Peasant ovchar;

	private static final double SREDEN_MLEKONADOI = 1.5; // <-- константа в Java
															// (static final)
	private static final double PULOVERI_NA_OVCA = 1;

	boolean hasZvunche;

	public Sheep(String name) {
		super(name);
	}

	void makeSound() {
		System.out.println("BeeeEeeEe");

		if (hasZvunche) {
			System.out.println("Dzun-dzun");
		}
	}

	static double getAvarageMilkQuantity() {
		return SREDEN_MLEKONADOI;
	}

	static int kolkoPuloveraMogaDaNapravq(int broiOvche) {
		return (int) (broiOvche * PULOVERI_NA_OVCA);
	}
}
