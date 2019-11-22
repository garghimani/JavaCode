package CoreJava;

import java.util.Scanner;

class MethodExample{
	double height,width,depth;
	
	//method returning a value
	double volume() {
		
		return height*width*depth;
	}
	
	//method returning value and takes parameters
	double cube(double i) {
		
		return i*i*i;
	}
	
	
}
public class ClassAndMethodExample {
    private static Scanner sc;
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
	    sc = new Scanner(System.in);
		double vol;
		double cube_vol;
		
		System.out.println("Enter the height :");
		me.height = sc.nextDouble();
		
		System.out.println("Enter the width :");
		me.width = sc.nextDouble();
		
		System.out.println("Enter the depth :");
		me.depth = sc.nextDouble();
		
		vol = me.volume();
		System.out.println("Volume is :"+vol);
		System.out.println();
		
		System.out.println("Enter the value for cube :");
		cube_vol = me.cube(sc.nextDouble());
				
		System.out.println("Volume of Cube is :"+cube_vol);

	}

}
