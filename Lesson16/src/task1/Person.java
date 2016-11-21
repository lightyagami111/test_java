package task1;

public class Person {

	private String name;
	private int age;
	private boolean isFemale;

	// default constructor
	public Person() {

	}

	protected Person(String name, int age, boolean isFemale) {
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	public void showPersonInfo() {
		System.out.println("����������:");
		System.out.println("- ���: " + getName());
		System.out.println("- ������: " + getAge());
		System.out.println("- ���: " + isFemale());
		System.out.println("---------------------");
	}

}
