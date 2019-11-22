package collectionframework.datastructure;

import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		TreeSet<String> treeset1 = treeset;
		
		System.out.println("Initial Size of Tree Set : "+treeset.size());
		
		treeset.add("X");
		treeset.add("S");
		treeset.add("A");
		treeset.add("L");
		treeset.add("E");
		treeset.add("V");
		treeset.add("R");
		treeset.add("C");
		treeset.add("R");
		treeset.add("W");
		treeset.add("D");
		
		System.out.println("Size of Tree Set : "+treeset.size());
		System.out.println("Contents of Tree Set : "+treeset);
		
		System.out.println("Element greater than U is :"+treeset.ceiling("U"));
		System.out.println("Element greater than Y is :"+treeset.ceiling("Y"));
		
		System.out.println("Element smaller than U is :"+treeset.floor("U"));
		System.out.println("Element smaller than Y is :"+treeset.floor("Y"));
		
		System.out.println("Tree Set contains Z :"+treeset.contains("Z"));
		System.out.println("Tree Set contains A :"+treeset.contains("A"));
		
		System.out.println("Descending Iterator : "+treeset.descendingIterator());
		System.out.println("Descending Tree Set : "+treeset.descendingSet());
		
		System.out.println("First Element  :"+treeset.first());
		System.out.println("Last Element  :"+treeset.last());
		
		System.out.println("Subset B and G : "+treeset.subSet("B", "G"));
		
		//treeset.remove(treeset);  // Remove the object treeset
		System.out.println("Contents in treeset : "+treeset);
		System.out.println("Contents in treeset 1 : "+treeset1);
		
		System.out.println("Comparing two objects : "+treeset.equals(treeset1));
		
		treeset1.add("Y");
        System.out.println("Contents in treeset 1 after adding element : "+treeset1);
		System.out.println("Comparing two objects : "+treeset.equals(treeset1));

	}

}
