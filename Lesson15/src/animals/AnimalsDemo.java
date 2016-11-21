package animals;

public class AnimalsDemo {

	public static void main(String[] args) {

		// променливата luv не може да сменя адреса си
		final Lion luv = new Lion("Lian", 3);
		luv.name = "Pesho";
		luv.name = "Penka";

	}

}
