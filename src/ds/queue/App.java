package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(30);
		myQueue.insert(20);
		myQueue.insert(54);
		myQueue.insert(23);
		myQueue.insert(10);
		myQueue.insert(63);
		myQueue.insert(73);
		myQueue.insert(93);
		myQueue.view();
		
	}

}
