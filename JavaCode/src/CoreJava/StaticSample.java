package CoreJava;


class StaticExample{
	
	static int y = 15;
	static int z = 22;
	
	static void staticmethexample() {
		
		System.out.println("Value of y is :"+y);
	}	
}

class StaticSample{
	
    static int a = 2;
	static int b;
	
	static void staticmeth(int x) {
		
		System.out.println("Value of x is :"+x);
		System.out.println("Value of a is :"+a);
		System.out.println("Value of b is :"+b);
	}
	
	static {
		System.out.println("Static Block Initialized.");
		b = a*5;
	}

	public static void main(String[] args) {
		staticmeth(20);
		
		//Calling a static method by class name
		StaticExample.staticmethexample();
		System.out.println("The value of z is :"+StaticExample.z); //static variable called by class name
		

	}

}
