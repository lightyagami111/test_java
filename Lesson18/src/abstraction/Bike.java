package abstraction;

public class Bike implements Vehicle{

	@Override
	public void turn(String direction) {
		System.out.println("Vrutni v posoka " + direction);
	}

	@Override
	public void stop() {
		System.out.println("Bii kontrata");
	}

	@Override
	public void accelerate() {
		System.out.println("Vurti gi qko pedalite!");
	}

}
