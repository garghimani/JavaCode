package CoreJavaExcercise;

import java.util.Scanner;

public class FibonacciSeriesSample {

	public static int Fibonacci(int n) {
		
		int f[] = new int[n+1];
		
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i<=n; i++) {
			
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
		
	}
	
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int x = sc.nextInt();
		
		System.out.println("Fibonacci Series for "+x +" is : "+Fibonacci(x));
		
		
		sc.close();

	}

}
