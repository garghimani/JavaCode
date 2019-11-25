package multithreading;

public class MainThread {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		
		System.out.println("Current Thread : "+thread);
		
		thread.setName("My Thread");
		System.out.println("After name Change : "+thread);
		
		try {
			
			for(int i=10; i>0; i--) {
				
				System.out.println(i);
				Thread.sleep(1000);
				
			}
			
		}
		catch(InterruptedException e) {
			
			System.out.println("Main Thread Interrupted : "+e);
			
		}
	}

}
