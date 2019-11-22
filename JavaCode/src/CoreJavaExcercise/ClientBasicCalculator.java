package CoreJavaExcercise;

import java.util.Scanner;

public class ClientBasicCalculator {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER TWO NUMBERS :");
        
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        
		BasicCalculator calculate = new BasicCalculator(value1, value2);
		
		System.out.println();
		System.out.println("------ CALCULATOR -------");
		System.out.println("Addition : "+calculate.addition());
		System.out.println("Subtraction : "+calculate.subtraction());
		System.out.println("Multiplication : "+calculate.multiplication());
		System.out.println("Division : "+calculate.division());
		
		sc.close();

	}

}
