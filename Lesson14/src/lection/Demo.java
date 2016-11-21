package lection;

public class Demo {

	public static void main(String[] args) {

		Car jiguli = new Car();
		jiguli.brand = "Jigula";
		jiguli.maxSpeed = 320;
		jiguli.currentGear = 2;
		jiguli.color = "Red";

		Car opel = new Car();
		opel.brand = "Opel";
		opel.model = "Astra";
		opel.maxSpeed = 220;

		Person batman = new Person();
		batman.name = "Batman";
		batman.age = 29;

		Person robin = new Person();
		robin.name = "Robi";
		robin.age = 15;
		batman.friend = robin;

		jiguli.owner = batman;
		robin.friend = batman;

		System.out.println(jiguli.owner.age);

		opel.changeGearUp();
		System.out.println(opel.currentGear);
		System.out.println(opel.color);
		opel.changeColor("Yellow");
		System.out.println(opel.color);
		opel.currentSpeed = 50;
		System.out.println("Current speed = " + opel.currentSpeed);
		for (int i = opel.currentSpeed; i < 1000; i++) {

			opel.accelerate();
		}
		System.out.println("Current speed = " + opel.currentSpeed);

		Car c1 = new Car();
		System.out.println(c1.brand);

	}
}
