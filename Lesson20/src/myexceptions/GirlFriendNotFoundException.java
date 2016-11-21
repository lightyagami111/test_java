package myexceptions;

public class GirlFriendNotFoundException extends Exception {

	@Override
	public String getMessage() {
		return "No girlfriend ... yeah.. ";
	}

}
