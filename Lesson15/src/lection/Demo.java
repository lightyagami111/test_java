package lection;

public class Demo {

	public static void main(String[] args) {

		// Mouse mishka0 = new Mouse("Pesho");
		// Mouse mishka1 = new Mouse("Lili");
		// Mouse mishka2 = new Mouse("Speedy", "Dark Brown");
		// Mouse mishka3 = new Mouse("Mickey", "Black");

		Car bmw = new Car("BMW", true, "magenta");
		bmw.setPrice(1000);

		Car audi = new Car("Audi", false, "red");
		audi.setPrice(2000);
		audi.changeColor("red");
		System.out.println(audi.color);
		audi.changeColor("yellow");
		System.out.println(audi.color);
		audi.changeColor("yellow");

		// System.out.println(car2.isMoreExpensive(car1));

	}
}
