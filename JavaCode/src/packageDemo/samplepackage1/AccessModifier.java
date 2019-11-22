package packageDemo.samplepackage1;

public class AccessModifier {
	
	int default_var = 10;
	private int private_var = 20;
	protected int protected_var = 30;
	public int public_var = 40;
	
    public AccessModifier() {
    	
    	System.out.println();
    	System.out.println("Access Modifier Constructor.");
    	System.out.println("default_var is :"+default_var);
    	System.out.println("private_var is :"+private_var);
    	System.out.println("protected_var is :"+protected_var);
    	System.out.println("public_var is :"+public_var);
    	
    }

}
