package animals;

public class Lion {

	final double weight;
	String name;
	String female;
	private int age;

	public Lion() {
		weight = 452;
	}

	public Lion(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

}
