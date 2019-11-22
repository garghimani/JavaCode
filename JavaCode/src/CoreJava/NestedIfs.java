package CoreJava;

import java.util.Scanner;
import java.text.*;

public class NestedIfs {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 to 12");
		int month = sc.nextInt();
		String season;

		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "Fall";
		else
			season = "Invalid Month";

		// System.out.println(month);

		String name_of_month = getMonthForInt(month - 1);

		// System.out.println(name_of_month);

		System.out.println("The " + name_of_month + " is in the season :" + season + ".");
	}

	// method to convert month number to month name
	public static String getMonthForInt(int m) {
		
		String month_name = "invalid";		
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();
		
		if (m >= 1 && m <= 12) {
			month_name = months[m];
		}
		return month_name;
	
	}
}
