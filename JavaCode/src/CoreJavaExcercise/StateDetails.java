package CoreJavaExcercise;

import java.util.*;

public class StateDetails {

	public static void main(String[] args) {

		List<String> state_code = Arrays.asList("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA");
		List<String> state_name = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
				"Connecticut", "Delaware", "Florida", "Georgia");
		List<String> state_capital = Arrays.asList("Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento",
				"Denver", "Hartford", "Dover", "Tallahassee", "Atlanta");

		System.out.println("CODE   STATE NAME      CAPITAL");
		System.out.println("----   ----------      --------");

		Iterator<String> itr_code = state_code.listIterator();
		Iterator<String> itr_name = state_name.listIterator();
		Iterator<String> itr_capital = state_capital.listIterator();

		while (itr_code.hasNext() || itr_name.hasNext() || itr_capital.hasNext()) {

			System.out.print(itr_code.next() + "      " + itr_name.next() + "       " + itr_capital.next());
			System.out.println();

		}

	}

}
