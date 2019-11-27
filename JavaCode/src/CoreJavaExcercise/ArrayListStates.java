package CoreJavaExcercise;

import java.util.*;

public class ArrayListStates {

	public static void main(String[] args) {

		System.out.println("---------------------- ARRAY LIST ----------------------------------");
		
		//Arrays.asList is used to add a list of elements.
		List<String> statename_list = Arrays.asList("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA",
				"GU", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MH", "MI", "MN", "MO", "MS",
				"MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "PW", "RI", "SC",
				"SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY");

		for (String statename : statename_list) {

			System.out.print(statename + " ");

		}

		System.out.println();
		System.out.println();
		System.out.println("--------------------- HASH SET -------------------------------------");

		Set<String> hashset_state = new HashSet<>();
		hashset_state.addAll(statename_list);

		Iterator<String> hash_itr = hashset_state.iterator();
		while (hash_itr.hasNext()) {

			String hash_element = hash_itr.next();
			System.out.print(hash_element + " ");

		}

		System.out.println();
		System.out.println();
		System.out.println("--------------------- TREE SET -------------------------------------");

		Set<String> treeset_state = new TreeSet<>();
		treeset_state.addAll(statename_list);

		Iterator<String> tree_itr = treeset_state.iterator();
		while (tree_itr.hasNext()) {

			String tree_element = tree_itr.next();
			System.out.print(tree_element + " ");
		}

		System.out.println();

	}

}
