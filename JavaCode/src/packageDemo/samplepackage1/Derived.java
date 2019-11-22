package packageDemo.samplepackage1;

public class Derived extends AccessModifier {
	
	Derived(){
		
		System.out.println();
		System.out.println("Derived Constructor.");
    	System.out.println("default_var is :"+default_var);
   // 	System.out.println("private_var is :"+private_var); // cannot be accessed in the subclass of same package
    	System.out.println("protected_var is :"+protected_var);
    	System.out.println("public_var is :"+public_var);
		
	}

}
