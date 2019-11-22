package CoreJava;


class ByValue{
	void valuemeth(int a, int b) {
		a *= 2;
		b /= 2;
		
	}	
}


public class CallByValue {

	public static void main(String[] args) {
		ByValue bv = new ByValue();
        
		int a=10, b=20;
		System.out.println("Value before method for a :"+a +"  b : "+b);
		
		bv.valuemeth(a,b);
		System.out.println("Value after method for a :"+a +"  b : "+b);
	}

}
