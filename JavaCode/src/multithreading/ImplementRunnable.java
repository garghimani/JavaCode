package multithreading;

class RunnableDemo implements Runnable {

	Thread t;

	RunnableDemo() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread : " + t);
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Inside Child Run Method : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Run Method Interrupted.");
		}

		System.out.println("Exiting Child Thread.");

	}
}

public class ImplementRunnable {

	public static void main(String[] args) {

		RunnableDemo rundemo = new RunnableDemo();

		rundemo.t.start();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Inside Main Method : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Mian Method Interrupted.");
		}

		System.out.println("Exiting Main Thread.");
	}
}
