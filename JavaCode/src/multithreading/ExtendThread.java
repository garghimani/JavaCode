package multithreading;

class ExtendThreadDemo extends Thread{
	
	ExtendThreadDemo(){
		super("Demo Thread");
		System.out.println("Child Thread : "+this);
	}
	
	public void run() {
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Inside Run Method : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child Run Method Interrupted.");
		}	
		System.out.println("Exiting Child Thread.");	
		}
	}
	

public class ExtendThread {

	public static void main(String[] args) {
		
		ExtendThreadDemo extendThread = new ExtendThreadDemo();
		
		extendThread.start();

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
