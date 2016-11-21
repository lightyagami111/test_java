package task1;

public class Student extends Person {

	private double score;

	private static final int MIN_SCORE = 2;
	private static final int MAX_SCORE = 6;

	// default constructor
	public Student() {

	}

	public Student(String name, int age, boolean isFemale) {
		super(name, age, isFemale);
	}

	void setScore(double score) {
		if (score > MIN_SCORE && score < MAX_SCORE) {
			this.score = score;
		} else {
			System.out.println("Score cannot be outside [2-6].");
		}
	}

	double getScore() {
		return score;
	}

	void showStudentInfo() {
		showPersonInfo();
		System.out.println("ќценка на ученика: " + getScore());
	}

}
