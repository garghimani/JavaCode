package exceptionHandlingSample;

class MyException extends Exception{
	
	private int data;
	
	MyException(int a){
		
		data = a;
	}
	
	public String toString() {
		
		return "MyException[" +data+ "]";
	}
}

public class MyExceptionUsingThrowDemo {

	static void calculate(int a) throws MyException {
		
		System.out.println("Called Calculate.");
		System.out.println("a : "+a);
		
		int b = a*a;
		
		if(b > 10)
			throw new MyException(b);
		System.out.println("Normal Exit.");
		System.out.println("Calculated Value : "+b);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			calculate(2);
			calculate(4);
		}
		
		catch(MyException e) {
			
			System.out.println("Exception Caught : "+e);
		}
	

	}

}
