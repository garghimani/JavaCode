package packageDemo.samplepackage1;

public class SamePackage {
	
	SamePackage(){

	AccessModifier accessmodifier = new AccessModifier();
	
	System.out.println();
	System.out.println("SamePackage Constructor.");
	System.out.println("default_var is :"+accessmodifier.default_var);
// 	System.out.println("private_var is :"+accessmodifier.private_var); // cannot be accessed in the class of same package
	System.out.println("protected_var is :"+accessmodifier.protected_var);
	System.out.println("public_var is :"+accessmodifier.public_var);
	
	}
	
}
