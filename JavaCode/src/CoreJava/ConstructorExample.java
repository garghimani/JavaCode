package CoreJava;

class ConstructorDefine {

	double height, width, depth;

	// Without Parameter Constructor
	ConstructorDefine() {
		System.out.println("Inside Constructor without parameters.");
		height = 2;
		width = 2.3;
		depth = 4;
	}

	// Parameterized Constructor
	ConstructorDefine(double h, double w, double d) {
		System.out.println("Inside Constructor with parameters");
		height = h;
		width = w;
		depth = d;
	}

	double volume() {
		return height * width * depth;
	}

}

public class ConstructorExample {

	public static void main(String[] args) {
		ConstructorDefine cd1 = new ConstructorDefine();
		double vol = cd1.volume();
		System.out.println("Volume for constructor without parameter is :" + vol);

		ConstructorDefine cd2 = new ConstructorDefine(10.0, 11.5, 12.5);

		vol = cd2.volume();
		System.out.println("Volume for constructor with parameter is :" + vol);

	}

}
