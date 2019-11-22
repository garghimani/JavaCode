package packageDemo.samplepackage2;

public class AccessModifier2 extends packageDemo.samplepackage1.AccessModifier{
	
	AccessModifier2(){
		
		System.out.println();
		System.out.println("Access Modifier 2 Constructor.");
    //	System.out.println("default_var is :"+default_var); //cannot be accessed by different package subclass
    //	System.out.println("private_var is :"+private_var); //cannot be accessed by different package subclass
    	System.out.println("protected_var is :"+protected_var);
    	System.out.println("public_var is :"+public_var);
		
	}

}
