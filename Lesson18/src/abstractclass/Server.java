package abstractclass;

public abstract class Server {

	protected final String name;

	public Server(String name) {
		this.name = name;
	}

	public abstract boolean start();

}
