package CoreJava;


//The final class cannot be inherited
final class FinalSample{
	
	static final int a = 10; // variable value cannot be changed if its declared final
	static int b = 20;
	int c;
	
	final void finalmeth(int x) {
		c= x;
		
		System.out.println("Value of x before :"+x);
		System.out.println("The value before are a :"+a+" and b :"+b);
	}
	
	
	//method overloading is allowed if final keyword is used in method
	void finalmeth(int d, int e) {
		
		System.out.println("values for d and e are : "+d+" "+e);
		
	}
}

class Parent1{
	
	Parent1(){
		
		System.out.println("Inside Parent1 Constructor.");
		
	}
	
	final void meth() {
		
	   System.out.println("Inside Parent1 Final Method.");
	}
}

class Child1 extends Parent1{
	
	Child1 (){
		
		super();
		System.out.println("Inside Child1 Constructor.");		
		
	}
	
	
	//Cannot Override Final Method.
	/*
	 * void meth() {
	 * 
	 * System.out.println("Inside Child1 Final Method."); }
	 */
}


public class FinalInheritanceExample {

	public static void main(String[] args) {
		FinalSample fs = new FinalSample();
		Parent1 p = new Child1();
		p.meth();
		
		System.out.println();
		fs.finalmeth(8);
		fs.finalmeth(1,2);
		fs.b = 10;
		System.out.println("The value after are a :"+fs.a+" b :"+fs.b);
    }

}
