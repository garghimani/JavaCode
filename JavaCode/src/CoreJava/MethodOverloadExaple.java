package CoreJava;

class Overload{
	
	void sum() {
		System.out.println("Non Parameretised Method");
	}
	
	void sum(int a, int b) {
		System.out.println("The sum for the parameterized method is :"+(a+b));
	}
	
	double sum(double x) {
		double z = x*x*x;
		System.out.println("The sum for the return type double method is :"+z);
		return z;
	}
	
}

public class MethodOverloadExaple {

	public static void main(String[] args) {
		Overload o = new Overload();
		double data;
		o.sum();
		o.sum(2,4);
	    data =  o.sum(3.2);

	}

}
