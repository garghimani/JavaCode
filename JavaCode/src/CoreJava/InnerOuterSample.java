package CoreJava;

class Outer{
	
	int outer_var  = 20;
	
	void outermeth(){
		
		Inner inner = new Inner();
		inner.innermeth();
		
	}
	
	class Inner{
		
		int inner_var = 10;
		
		void innermeth()
		{
			System.out.println("The value of outer_var is :"+outer_var);
			System.out.println("The value of inner_var is :"+inner_var);
			
		}		
	}
}


public class InnerOuterSample {
	public static void main(String[] args) {
		
    Outer outer = new Outer();
    outer.outermeth();
		
	}

}
