package task1;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isFemale, double daySalary) {
		super(name, age, isFemale);
		setDaySalary(daySalary);
	}

	double calculateOvertime(double hours) {
		double coeficient = 1.5;

		if (super.getAge() < 18) {
			return 0;
		}

		return (getDaySalary() / 8) * hours * coeficient;
	}

	void setDaySalary(double daySalary) {
		if (daySalary < 0) {
			System.out.println("Day salary cannot be negative.");
			return;
		}

		this.daySalary = daySalary;
	}

	double getDaySalary() {
		return daySalary;
	}

	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Заплата : " + this.getDaySalary());
	}

}
