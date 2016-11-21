package abstraction;

public class Plane implements Vehicle{

	@Override
	public void turn(String direction) {
		System.out.println("Turning " + direction);
	}

	@Override
	public void stop() {
		System.out.println("Engines lose power");
	}

	@Override
	public void accelerate() {
		System.out.println("Durpame ru4kata kum nas");
	}

}
