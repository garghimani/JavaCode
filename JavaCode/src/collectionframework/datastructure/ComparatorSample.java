package collectionframework.datastructure;

import java.util.*;

class ComparatorDemo implements Comparator<String>{
	
	//compare() method of Comparator reverse the order of elements
	public int compare(String str1, String str2) {
		
		return str2.compareTo(str1);
		
	}
	
}

public class ComparatorSample {

	public static void main(String[] args) {
		SortedSet<String> sortedset = new TreeSet<String>(new ComparatorDemo());
		
		//Directly use reverseorder() method to reverse the elements
		SortedSet<String> sortedset1 = new TreeSet<String>(Comparator.reverseOrder());
		
		
		
		sortedset1.add("D");
		sortedset1.add("A");
		sortedset1.add("Z");
		sortedset1.add("B");
		sortedset1.add("R");
		sortedset1.add("U");
		
		System.out.println("----------------USING REVERSEORDER() --------------------------- ");
		for(String element : sortedset1)
			System.out.println(element + " ");
		
		System.out.println();
		
		sortedset.add("D");
		sortedset.add("A");
		sortedset.add("Z");
		sortedset.add("B");
		sortedset.add("R");
		sortedset.add("U");
		
		System.out.println("--------------- USING COMPARE() METHOD ---------------------");
		for(String element : sortedset)
			System.out.println(element + " ");
		
		System.out.println();
		

	}

}
