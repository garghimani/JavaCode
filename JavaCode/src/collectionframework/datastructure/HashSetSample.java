package collectionframework.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		
		System.out.println("-------------- HASH SET ----------------");
		System.out.println("Intial size of hash set :"+hashset.size());
		
		hashset.add("Beta");
		hashset.add("Alpha");
		hashset.add("Eta");
		hashset.add("Gamma");
		hashset.add("Eplison");
		hashset.add("Omega");
		
		//In HashSet the elements are stored in Sorted Order. 
		//The sequence varies.
		System.out.println("Size of hash set after adding elements :"+hashset.size());
		System.out.println("Contents in Hash Set are : "+hashset);

		System.out.println("Clone of hash set : "+hashset.clone());
		
		System.out.println("Contains HashSet Element : "+hashset.contains("HashSet"));
		
		hashset.remove("HashSet");
		System.out.println("Contents in Hash Set are : "+hashset);
		
		System.out.println("Contains HashSet Element : "+hashset.contains("HashSet"));
		System.out.println("Size of hash set after removing elements :"+hashset.size());
		System.out.println();
		System.out.println("------------- LINKED HASH SET --------------");
		
		LinkedHashSet<String> linkedhs = new LinkedHashSet<String>();
		
		linkedhs.add("Beta");
		linkedhs.add("Alpha");
		linkedhs.add("Eta");
		linkedhs.add("Gamma");
		linkedhs.add("Eplison");
		linkedhs.add("Omega");
		
		System.out.println("Size of linked hash set after adding elements :"+linkedhs.size());
		System.out.println("Contents in Linked Hash Set are : "+linkedhs);
	}

}
