package lection;

public class Person {

	public String name;
	int age;
	String sex;
	double weight;
	Person[] friends; // списък с приятели
	int health;
	int hunger;
	int mentality;
	double money;
	Car myCar;

	public Person() {
		age = 0;
		weight = 3.5;
		// System.out.println("Small constructor has been invoked");
	}

	public Person(String name) {
		this();
		if (!name.isEmpty()) {
			this.name = name;
		}
		// System.out.println("Large constructor has been invoked");

		friends = new Person[3];

	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
		// System.out.println("Grand constructor has been invoked");
	}

	public Person(String name, String gender) {
		this(name);
		this.sex = gender;
		// System.out.println("Grand constructor has been invoked");
	}

	Person(String name, int age, String sex) {
		this(name, age);
		this.sex = sex;
	}

	void eat() {
		hunger--;
	}

	void heal() {
		health++;
	}

	void buyCar(Car car) {
		if (this.money >= car.getPrice()) {
			this.money -= car.getPrice();
			this.myCar = car;

			car.changeOwner(this);
		}

	}

}
