package varargs;

public class Worker {

	void work(int x, String... tasks) {
		System.out.println(tasks.length);
	}

}
