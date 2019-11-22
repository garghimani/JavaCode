package CoreJava;

import java.util.Scanner;

public class SwitchForExample {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);//for int input

		System.out.println("Eneter a number between 0 and 3");

		int j = sc.nextInt();
	

		for (int i = 0; i < j; i++) {
			switch (i) {
			case 0:
				System.out.println("i is zero");
				break;
			case 1:
				System.out.println("i is one");
				break;
			case 2:
				System.out.println("i is two");
				break;
			case 3:
				System.out.println("i is three");
				break;
			default:
				System.out.println("Number entered is greater than 3");
				break;
			}
		}
			
			System.out.println("Enter a value from : one  two  three  four.");
			String num = sc.next(); // for String input
			
			switch(num) {
			case "one" :
			     System.out.println("The value entered is one");
			     break;
			case "two" :
			     System.out.println("The value entered is two");
			     break;
			case "three" :
			     System.out.println("The value entered is three");
			     break;
			case "four" :
			     System.out.println("The value entered is four");
			     break;
			default :
				System.out.println("Invalid value entered");
				break;
		}

	}

}
