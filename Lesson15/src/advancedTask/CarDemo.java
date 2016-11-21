package advancedTask;

import lection.Car;
import lection.Person;

public class CarDemo {

	public static void main(String[] args) {
		Car audi = new Car("audi", true, "black");
		Car bmw = new Car("bmw", false, "yellow");
		Car opel = new Car("opel", false, "yellow");
		Car mercedes = new Car("mercedes", false, "yellow");
		Car honda = new Car("honda", false, "yellow");

		CarShop carShop = new CarShop(4);

		boolean result = carShop.addCar(audi);

		Car nextCar = carShop.getNextCar();

		System.out.println(nextCar.model);

		// boolean result2 = carShop.addCar(bmw);
		// boolean result3 = carShop.addCar(opel);
		// boolean result4 = carShop.addCar(mercedes);
		// boolean result5 = carShop.addCar(honda);

		// System.out.println(result2 ? "добавянето е успешно" : "добавянето не
		// е успешно");
		// System.out.println("свободни места: " + carShop.freeSpaces);

		Person pesho = new Person("Pesho");
		Person viktor = new Person("Viktor");

		carShop.sellNextCar(pesho);
		System.out.println(carShop.freeSpaces);

		// print cars info
		// carShop.removeCar(audi);
		carShop.showAllCarsInShop();

	}

}
