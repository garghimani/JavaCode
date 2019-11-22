package CoreJava;

import java.util.Scanner;

public class ConsoleInput {
	private static Scanner sc;

	public static void main(String[] args) {
		int a, b, c, d;

		sc = new Scanner(System.in);

		System.out.println("Enter the number between 1 to 10");
		a = sc.nextInt();

		System.out.println("Enter another number between 1 to 10");
		b = sc.nextInt();

		c = (a + b);
		System.out.println("The sum is :" + c);// sum of two numbers

		String month_name[] = { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov",
				"Dec" };// array of months
		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// array of days in month
		System.out.println("Select a month from below:");
		System.out.println("0.Jan 1.Feb 2.March 3.April 4.May 5.June 6.July 7.Aug 8.Sept 9.Oct 10.Nov 11.Dec");
		d = sc.nextInt();
		// printing days and month by taking input from console
		System.out.println("Number of days in the " + month_name[d] + " are : " + month_days[d]);

	}

}
