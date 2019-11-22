package CoreJavaExcercise;

public class GenerateDemo {

	public static void main(String[] args) {
		
		int count = 1000;
		
		System.out.println("GENERATING 1000 NUMBERS.");
		System.out.println("------------------------");
		
		for(int i=1; i<=count; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println();
		System.out.println("GENERATING MULTIPLE OF 5 LESS THAN 1000.");
		System.out.println("-----------------------------------------");

		int num1 = 5;
		
		while(num1 < count) {
			
			System.out.println(num1);
			num1 = num1+5;
			
		}
		
		System.out.println();
		System.out.println("GENERATING ODD NUMBERS UPTO 1000.");
		System.out.println("----------------------------------");
		
		int num2 = 1;
		
		while(num2 < count) {
			
			System.out.println(num2);
			num2 = num2+2;
			
		}
		

	}

}
