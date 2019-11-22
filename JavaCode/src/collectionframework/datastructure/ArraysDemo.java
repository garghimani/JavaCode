package collectionframework.datastructure;

import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
		for(int i = 0; i<10; i++) 
			array[i] = -3 * i;
		
		//Display, Sort, Display Array
		System.out.println("Original Array : ");
		display(array);
		Arrays.sort(array);
        System.out.println("Sorted Array : ");
        display(array);
        
        //Fill and Display Array
        Arrays.fill(array, 2,4,-1); //Method Fill() replaces elements between 2 and 4 with -1
        System.out.println("After fill() : ");
        display(array);
        
        //Sort and Display Array
        Arrays.sort(array);
        System.out.println("Sorted Array Again : ");
        display(array);
		
        //Binary Search for element
        System.out.println("Element -3 is at index : ");
        int index = Arrays.binarySearch(array, -3);
        System.out.println(index);
		
		
       

	}
	
	//Method To Display Array Elements
	static void display(int array[]) {
		for(int i : array)
			System.out.print(i +" ");
		
		System.out.println();
	}

}
