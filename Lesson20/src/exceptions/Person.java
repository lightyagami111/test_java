package exceptions;

public class Person {

	private String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		this.name = name;
	}

	public boolean hasTheSameName(Person p) {
		return method1(p);
	}

	private boolean method1(Person p) {
		return method2(p);
	}

	private boolean method2(Person p) {
		return method3(p);
	}

	private boolean method3(Person p) {
		return method4(p);
	}

	private boolean method4(Person p) {
		return this.name.equals(p.name);
	}
}
