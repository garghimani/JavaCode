package CoreJavaExcercise;

public class ArmstrongSample {

	public static void main(String[] args) {

		int c = 0, remainder, temp;
		int number = 153;

		temp = number;
		while (number > 0) {
			remainder = number % 10;
			c = c + (remainder * remainder * remainder);
			number = number / 10;
		}

		if (temp == c)
			System.out.println(temp + " is Armstrong Number..");
		else
			System.out.println(temp + " is not an Armstrong Number..");

	}

}
