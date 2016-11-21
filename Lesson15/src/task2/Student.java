package task2;

public class Student {

	private String name;
	private String subject; // ñïåöèàëíîñò
	private double grade; // óñïåõ
	private int yearInCollåge; // êóðñ
	private int age; // ãîäèíè íà ñòóäåíòà
	private boolean isDegree; // äàëè å çàâúðøèë èëè íå
	private double money; // ïàðè îò ñòèïåíäèè

	public Student() {
		this.grade = 4.0;
		this.yearInCollåge = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public int getYearInCollåge() {
		return yearInCollåge;
	}

	public void setYearInCollåge(int yearInCollåge) {
		this.yearInCollåge = yearInCollåge;
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
			System.out.println("Ñòóäåíòúò å çàâúðøèë.");
			return;
		} else {
			yearInCollåge++;
			if (yearInCollåge == 4) {
				isDegree = true;
			}
		}
	}

	void setYearInCollege(int yearInCollåge) {
		if (yearInCollåge > 1 && yearInCollåge < 5) {
			this.yearInCollåge = yearInCollåge;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (amount <= 0) {
			System.out.println("Íåâàëèäíà ñóìà çà ïðåâîä íà ñòèïåíäèÿ.");
		}

		if (min <= 0 || (min >= 1 && min <= 2)) {
			System.out.println("Ìèíèìàëíèÿ óñïåõ íà ñòóäåíòà òðÿáâà äà áúäå ïî-âèñîê îò 2.00");
		}

		if (this.grade >= min && this.age < 30) {
			money += amount;
		}
		return money;
	}

}
