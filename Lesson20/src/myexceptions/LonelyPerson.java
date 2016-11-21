package myexceptions;

public class LonelyPerson {

	private String name;
	LonelyPerson gf;

	public void goOutWithGF() {
		try {
			if (gf == null) {
				throw new GirlFriendNotFoundException();
			}
		} catch (GirlFriendNotFoundException e) {
			System.out.println("No mace... daite mu na choveka mace!");
		}
	}

	public void goSpeedDating() {
		System.out.println("I hope hope, hope, hope ...");
	}

}
