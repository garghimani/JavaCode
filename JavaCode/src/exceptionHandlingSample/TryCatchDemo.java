package exceptionHandlingSample;

public class TryCatchDemo {

	public static void main(String[] args) {

		try {

			int a = args.length;

			System.out.println("a = " + a);

			int b = 10 / a;
			
			System.out.println("b : "+b);

			int c[] = { 1 };

			c[42] = 99;

			System.out.println(c);
		}

		catch (ArithmeticException e) {

			System.out.println("b divided by zero.");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array Index Out Of Bound.");

		}

		System.out.println("After Try/Catch Block.");

	}

}
