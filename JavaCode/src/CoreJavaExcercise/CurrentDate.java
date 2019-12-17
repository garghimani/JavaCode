package CoreJavaExcercise;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CurrentDate {

	public static void main(String[] args) throws Exception {

		DateTimeFormatter date1 = DateTimeFormatter.ofPattern("MM/dd/yy");
		LocalDateTime localDate = LocalDateTime.now();
	
		//Date in the system.
		System.out.println(localDate.toLocalDate());
		
		//Date in MM/dd/yy format
		System.out.println(date1.format(localDate));

		//Date in dd day month yyyy format.
		System.out.println(localDate.getDayOfMonth() + " " + localDate.getDayOfWeek() + " " + localDate.getMonth() + " "
				+ localDate.getYear());

	}

}
