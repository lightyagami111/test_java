package exceptionchaining;

import java.util.Random;

public class Person {

	private boolean smoker = true;

	public boolean asleep() {
		return true;
	}

	public void smoke() throws FasException {
		if (new Random().nextBoolean()) {
			throw new FasException();
		}
	}
}
