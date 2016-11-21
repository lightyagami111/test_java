package task2;

public class GSM {

	String model; // модел на телефона
	boolean hasSimCard; // дали в телефона е заредена SIM карта
	String simMobileNumber; // номер на SIM картата, ако е зададена (телефонен
							// номер)
	double outgoingCallsDuration; // общото време на изходящите повиквания

	String lastIncomingCall; // последно входящо повикване
	String lastOutgoindCall; // последно изходящо повикване

	void insertSimCard(String newSimMobileNumber) {

		boolean hasDigits = true;

		for (int i = 0; i < newSimMobileNumber.length(); i++) {
			if (!Character.isDigit(newSimMobileNumber.charAt(i))) {
				hasDigits = false;
				break;
			}
		}

		if (!hasDigits) {
			System.out.println("SIM Mobile number must contains only digits");
			return;
		}

		if (newSimMobileNumber.startsWith("08") && newSimMobileNumber.length() == 10) {
			this.simMobileNumber = newSimMobileNumber;
			hasSimCard = true;
		} else {
			System.out.println("Invalid sim mobile number.");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
	}

	void call(GSM receiver, double duration) {

		boolean validCall = true;

		StringBuilder errors = new StringBuilder();

		if (this.hasSimCard == false || receiver.hasSimCard == false) {
			validCall = false;

			errors.append("Caller and receiver must have sim card.");

			System.out.println("Caller and receiver must have sim card.");
			return;
		}

		if (simMobileNumber.equals(receiver.simMobileNumber)) {
			validCall = false;
			errors.append("Caller and receiver must be different.");
			System.out.println("Caller and receiver must be different.");
			return;
		}

		if (duration <= 0) {
			validCall = false;
			errors.append("Duration must not be negative.");
			System.out.println("Duration must not be negative.");
			return;
		}

		if (validCall) {
			lastOutgoindCall = receiver.simMobileNumber;
			receiver.lastIncomingCall = simMobileNumber;
			outgoingCallsDuration += duration;
		}

		// String[] errorsArr = new String[3];
		// if (errors.length() > 0) {
		// if (errors.indexOf(".") != -1) {
		// errorsArr = errors.toString().split(".");
		// }
		// }

		// if (errorsArr.length > 0) {
		// for (int i = 0; i < errorsArr.length; i++) {
		// System.out.println(errorsArr[i]);
		// }
		// }

	}

	void getSumForCall() {
		if (outgoingCallsDuration > 0) {
			System.out.println("Total cost for calls is " + outgoingCallsDuration * Call.priceForMinute);
		} else {
			System.out.println("No outgoing calls for this sim number. Total cost for calls is 0.00");
		}
	}

	void printInfoForLastOutgoingCall() {
		if (lastOutgoindCall != null) {
			System.out.println("Last outgoing call for sim number " + simMobileNumber + " is " + lastOutgoindCall);
		} else {
			System.out.println("No outgoing calls for this sim number.");
		}
	}

	void printInfoForLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Last incoming call for sim number " + simMobileNumber + " is " + lastIncomingCall);
		} else {
			System.out.println("No incoming calls for this sim number.");
		}
	}

}
