package CoreJava;

public class StringSample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = str1;
		String str4 = "hello";
		
		System.out.println("String One : "+str1);
		System.out.println("String Two : "+str2);
		System.out.println("String Three : "+str3);
		
		str1 = str1.concat(" World.");
		System.out.println("String One after concat :"+str1);
		System.out.println("String Three is :"+str3);
		
		System.out.println("String One Length is : "+str1.length()); //Length of the string
		System.out.println("String One char at 1 is : "+str1.charAt(1)); //Character at specified index
		
		
		//Checking two Strings for equality
		if (str1.equals(str2))
			System.out.println("String One is equal to String Two.");
		else
			System.out.println("String One is not equal to String Two.");
		
		if (str1.equals(str3))
			System.out.println("String One is equal to String Three.");
		else
			System.out.println("String One is not equal to String Three.");
		
		if (str1==str2)
			System.out.println("String One == String Two.");
		else
			System.out.println("String One != String Two.");
		
		if (str1==str3)
			System.out.println("String One == String Three.");
		else
			System.out.println("String One != String Three.");
		
		if (str1==str4)
			System.out.println("String One == String Four.");
		else
			System.out.println("String One != String Four.");
		
		if (str1.equalsIgnoreCase(str4)) // Checking for equality by ignoring the case of the String
			System.out.println("String One is equal to String Four.");
		else
			System.out.println("String One is not equal to String Four.");
		
		
		//Sample of String Arrays		
		String str[] = {"abc","def","ghi"};
		
	    for(int i=0; i<str.length; i++)
	    {
	    	
	    System.out.println("str["+i+"] :"+str[i]);	
	    	
	    }
	    
	    //Different Way of declaring for loop
	    for (String s : str) 
	   {
	    	
	    	System.out.println(s);
	    	
	   }

	}

}
