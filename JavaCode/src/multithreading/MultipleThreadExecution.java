package multithreading;

class NewThread implements Runnable{
	
	Thread t;
	String name;
	
	NewThread(String threadName){
		name = threadName;
		t = new Thread(this,name);
		System.out.println("New Thread : "+t);
	}
	
	public void run() {
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name+ " : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("New Thread Interrupted.");
		}
		System.out.println("Exiting "+name+" Thread.");
	}
	
}

public class MultipleThreadExecution {

	public static void main(String[] args) {
		
		NewThread newthread1 = new NewThread("One");
		NewThread newthread2 = new NewThread("Two");
		NewThread newthread3 = new NewThread("Three");
		
		newthread1.t.start();
		newthread2.t.start();
		newthread3.t.start();
		
        System.out.println("Main Thread.");
	}

}
