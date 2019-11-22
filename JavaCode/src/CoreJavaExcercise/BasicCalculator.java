package CoreJavaExcercise;

public class BasicCalculator {
	
	private int val1;
	private int val2;
	private int val3;
	
	BasicCalculator(int a, int b){
		
		val1 = a;
		val2 = b;
		
	}
	
	public int addition() {
				
		val3 = (val1+val2);
		
		return val3;
		
	}
	
    public int subtraction() {
				
		val3 = (val1-val2);
		
		return val3;
		
	}
	
    public int multiplication() {
    	
		val3 = (val1*val2);
		
		return val3;
		
	}
    
    public int division() {

		val3 = (val1/val2);
		
		return val3;
		
	}
}

