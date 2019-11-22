package collectionframework.datastructure;

import java.util.*;

public class AlgorithmDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(-4);
		list.add(7);
		list.add(15);
		list.add(-20);
		list.add(6);
		list.add(-7);
		list.add(9);
		list.add(-6);
		list.add(17);
		
		Comparator<Integer> comp = Collections.reverseOrder();
		
		Collections.sort(list, comp);
		
		System.out.println("Reverse Sorted List :");
		System.out.println("----------------------");
		for(int i : list)
			System.out.print(i+" ");
		    
		System.out.println();
		System.out.println();
		
		Collections.shuffle(list);
		
		System.out.println("Shuffeled List :");
		System.out.println("-----------------");
		for(int i : list)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println();
		System.out.println("Minimum : "+Collections.min(list));
		System.out.println("Maximum : "+Collections.max(list));
		System.out.println();
		
		System.out.println("------------- BINARY SEARCH -------------------");
		Collections.sort(list);
		for(int i : list) 
		System.out.println("Index of "+i+" is : ["+Collections.binarySearch(list, i)+"]");
		
	}

}
