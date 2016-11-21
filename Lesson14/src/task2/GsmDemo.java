package task2;

public class GsmDemo {

	public static void main(String[] args) {
		// caller gsm number
		GSM gsm1 = new GSM();
		gsm1.insertSimCard("0889920814");

		// receiver gsm number
		GSM gsm2 = new GSM();
		gsm2.insertSimCard("0892563352");

		GSM gsm3 = new GSM();
		gsm3.insertSimCard("0877015511");
		gsm3.removeSimCard();

		// make a call
		gsm1.call(gsm3, 5);

		// gsm1.printInfoForLastOutgoingCall();
		// gsm2.getSumForCall();

		// gsm2.printInfoForLastIncomingCall();

	}

}
