package task2;

public class Student {

	private String name;
	private String subject; // �����������
	private double grade; // �����
	private int yearInColl�ge; // ����
	private int age; // ������ �� ��������
	private boolean isDegree; // ���� � �������� ��� ��
	private double money; // ���� �� ���������

	public Student() {
		this.grade = 4.0;
		this.yearInColl�ge = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public int getYearInColl�ge() {
		return yearInColl�ge;
	}

	public void setYearInColl�ge(int yearInColl�ge) {
		this.yearInColl�ge = yearInColl�ge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	void upYear() {
		if (isDegree) {
			System.out.println("��������� � ��������.");
			return;
		} else {
			yearInColl�ge++;
			if (yearInColl�ge == 4) {
				isDegree = true;
			}
		}
	}

	void setYearInCollege(int yearInColl�ge) {
		if (yearInColl�ge > 1 && yearInColl�ge < 5) {
			this.yearInColl�ge = yearInColl�ge;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (amount <= 0) {
			System.out.println("��������� ���� �� ������ �� ���������.");
		}

		if (min <= 0 || (min >= 1 && min <= 2)) {
			System.out.println("���������� ����� �� �������� ������ �� ���� ��-����� �� 2.00");
		}

		if (this.grade >= min && this.age < 30) {
			money += amount;
		}
		return money;
	}

}
