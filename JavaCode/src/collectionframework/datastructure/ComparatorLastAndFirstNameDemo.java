package collectionframework.datastructure;

import java.util.*;

class LastNames implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		int i,j;
		
		i = str1.lastIndexOf(' ');
		j = str2.lastIndexOf(' ');
		
		return str1.substring(i).compareToIgnoreCase(str2.substring(j)); 
	}
	
}

class FirstNames implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		return str1.compareToIgnoreCase(str2);
	}
	
}

public class ComparatorLastAndFirstNameDemo {

	public static void main(String[] args) {
		LastNames lastname = new LastNames();
		
		//Ordering on the basis of Last Name
		//If Last Name is same then comparing on the basis of First Name
		Comparator<String> compLastThenFirst = lastname.thenComparing(new FirstNames());
		Map<String , Double> map = new TreeMap<>(compLastThenFirst);
		
		map.put("John Smith", 4324.57);
		map.put("Rory Smith", 2000.99);
		map.put("Sara Williams", 3200.50);
		map.put("Gwen Dimitri", 1200.23);
		map.put("Dana Hall", 3400.87);
		
		Set<Map.Entry<String, Double>> set = map.entrySet();
		
		for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey()+" : ");
		    System.out.println(me.getValue());
		}
		
	}

}
