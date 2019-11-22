package collectionframework.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		System.out.println("Initial size of Array List is : "+arraylist.size());
		
		//Adding Elements to the Array List
		arraylist.add("Hi");
		arraylist.add("This");
		arraylist.add("Is");
		arraylist.add("The");
		arraylist.add("First");
		arraylist.add("Array List");
		
		System.out.println("Size of Array List after adding elements is : "+arraylist.size());
		
		//Display Data in Array List
		System.out.println("Elements in Array List are : "+arraylist);
		
		//Removing elements from Array List
		arraylist.remove(3);
		arraylist.remove(3); // The size of Array List is reduced as the elements are removed and elements are shifted to previous location
		
		System.out.println("Size of Array List after removing elements is : "+arraylist.size());
		System.out.println("Elements in Array List are : "+arraylist);
		
		System.out.println();
		System.out.println("---------------------- ARRAY LIST TO ARRAY -------------------------");
		//ArrayList To Array
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//Add elements to the array list.
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(8);
		al.add(3);
		
		System.out.println("Contents of array list : "+al);
		System.out.println("Size of array list : "+al.size());
		
		Integer integerarray[] = new Integer[al.size()];
		integerarray = al.toArray(integerarray);
		
		int sum = 0;
		
		for(int i : integerarray)
			sum += i;
		
		System.out.println("Sum is : "+sum);	
		
		
		//Iterators
		System.out.println();
		System.out.println("-----------------  ITERATORS -----------------");
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("A");
		arrlist.add("F");
		arrlist.add("E");
		arrlist.add("H");
		arrlist.add("I");
		arrlist.add("U");
		arrlist.add("O");
		
		//Using Iterators To Display Contents 
		System.out.println("Original Contents : ");
		Iterator<String> itr = arrlist.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element +" ");
			
		}
		System.out.println();
		System.out.println();
		
		//Modify Objects 
		ListIterator<String> listitr = arrlist.listIterator();
		while(listitr.hasNext()) {
			String element  = listitr.next();
			listitr.set(element + "+");
		}
		
		//Display Modified Contents
		System.out.println("Modified List : ");
		itr = arrlist.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element +" ");
			
		}
		System.out.println();
		System.out.println();
		
		//Display List Backwards
		System.out.println("Modified List Backwards : ");
		while(listitr.hasPrevious()) {
			String element = listitr.previous();
			System.out.print(element +" ");
			
		}
		System.out.println();
		
		
		//FOR-EACH Alternative to Iterators
		
		System.out.println();
		System.out.println("------------------- FOR EACH ALTERNATIVE TO ITERATOR -----------------------");
		
		List<Double> arls = new ArrayList<>();
		
		arls.add(2.5);
		arls.add(3.0);
		arls.add(1.5);
		arls.add(4.5);
		arls.add(2.0);
		arls.add(1.0);
		arls.add(3.5);
		arls.add(1.2);
		arls.add(4.7);
		arls.add(2.9);
		
		System.out.println("Contents : ");
		for(double v : arls)
			System.out.print(v +" ");
		
		System.out.println();
		
		double list_sum = 0.0 ;
		
		for(double v : arls)
			list_sum += v;
	        System.out.println("Sum is : "+list_sum);	
	        
	   //SPLITERATOR
	   
	   Spliterator<Double> splititr1 = arls.spliterator();
	   Spliterator<Double> splititr2 = splititr1.trySplit();
	   Spliterator<Double> splititr3 = splititr2.trySplit();
	   Spliterator<Double> splititr4 = splititr1.trySplit();
	   
	   System.out.println();
	   System.out.println("------------- SPLITERATOR ------------------");
	   System.out.println("Size of List : "+arls.size()); 
	   System.out.println("SPLITERATOR 1 size : "+splititr1.estimateSize());
	   System.out.println("SPLITERATOR 2 size : "+splititr2.estimateSize());
	   System.out.println("SPLITERATOR 3 size : "+splititr3.estimateSize());
	   System.out.println("SPLITERATOR 4 size : "+splititr4.estimateSize());
	   System.out.println();
	   
	   System.out.println("Contents of List : "+arls);
	   System.out.println();
	   System.out.println("SPLITERATOR 1 contents : ");
	   splititr1.forEachRemaining(System.out :: println); // FOREACHREMAINING access data sequentially in a single thread.
	   
	   System.out.println("------------------");
	   
	   System.out.println("SPLITERATOR 2 contents : ");
	   splititr2.forEachRemaining(System.out :: println);
		
	   
       System.out.println("------------------");
	   
	   System.out.println("SPLITERATOR 3 contents : ");
	   while(splititr3.tryAdvance((n) -> System.out.println(n))); //TRYADVANCE iterate elements individually in different threads.
	                                                              //Supports PARALLEL PROCESSING
	   
       System.out.println("------------------");
	   
	   System.out.println("SPLITERATOR 4 contents : ");
	   splititr4.tryAdvance(System.out :: println); // Here One element is processed per TRYADVANCE execution
	   splititr4.tryAdvance(System.out :: println);
	  // while(splititr4.tryAdvance((n) -> System.out.println(n)));
	}

}
