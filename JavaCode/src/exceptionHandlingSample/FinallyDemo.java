package exceptionHandlingSample;

import java.util.Random;

public class FinallyDemo {

	public static void main(String[] args) {
		int a, b;

		// try/catch and finally Block
		try {

			b = 0;
			a = 20 / b;

			System.out.println("The value of a is : " + a);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Divided by zero. ");
			System.out.println();
		}
		
		finally {
			System.out.println("In the Finally Block.");
			System.out.println();
		}

		int x = 0, y = 0, z = 0;

		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			try {

				y = random.nextInt();
				z = random.nextInt();
				x = 50 / (y / z);

			}

			catch (ArithmeticException e) {

				System.out.println("x is divided by zero.");
				x = 0;
			}

			System.out.println("x : " + x);

		}
	}

}
