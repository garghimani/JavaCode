package CoreJava;

class Parent{
	
    int i,j;
    private int a = 2;
    int supvar;
    
    Parent(){
    	
    	System.out.println("Default Parent Constructor.");
    	System.out.println();
    	
    }
    
    Parent(int var1, int var2){
    	
    	System.out.println("The value of Var1 and Var2 are :"+var1+"  "+var2);
    }
    
	void sum() {
		
		System.out.println("a+i+j = "+(a+i+j));		
	}
	
}

class Child extends Parent{
	
	int k;
	int supvar;
	
	Child(int childvar1 , int childvar2){
		
	super(childvar1, childvar2);
	
	}
	
	void multiply() {
		
		System.out.println("i*j*k = "+(i*j*k));
	}
	
	Child(int var1, int var2, int var3){
		
		super();
		
		super.supvar = var1;
		supvar = var2;
		System.out.println("The value of var3 in child constructor is :"+var3);
	}
	
	void display() {
		
		System.out.println("supvar in Parent Class :"+super.supvar);
		System.out.println("supvar in Child Class :"+supvar);
		
	}
	
}


public class InheritanceSample {

	public static void main(String[] args) {
		
	System.out.println("Parent Constructor.");
	Parent parent = new Parent(1,2);

	System.out.println();
	System.out.println("Child Constructor calling Parent Constructor.");
	Child child = new Child(2,3);
	
	Child child1 = new Child(5,6,7);
	
	System.out.println();
	System.out.println("The data from Parent Class");
	parent.i=10;
	parent.j=20;
	parent.sum();

	System.out.println();
	System.out.println("The data from Child Class");
	child.i=11;
	child.j=23;
	child.k=2;
	child.sum();
	child.multiply();
	
	System.out.println();
	System.out.println("In the second constructor of Child");
	child1.display();
		
	}

}
