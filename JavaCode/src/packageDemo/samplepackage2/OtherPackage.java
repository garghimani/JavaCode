package packageDemo.samplepackage2;

import packageDemo.samplepackage1.AccessModifier;

public class OtherPackage {
	
	OtherPackage(){
		
		AccessModifier accessmodifier = new AccessModifier();
		
		System.out.println();
		System.out.println("Other Package Constructor.");
	 //	System.out.println("default_var is :"+accessmodifier.default_var); // cannot be accessed in the class of different package
    //   System.out.println("private_var is :"+accessmodifier.private_var); // cannot be accessed in the class of different package
	//	System.out.println("protected_var is :"+accessmodifier.protected_var); // cannot be accessed in the class of different package
		System.out.println("public_var is :"+accessmodifier.public_var);
		
	}

}
