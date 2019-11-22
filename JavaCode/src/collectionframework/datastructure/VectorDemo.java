package collectionframework.datastructure;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>(3,2);

        System.out.println("Initial Size : "+vector.size());
        System.out.println("Initial Capacity : "+vector.capacity());
        
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        
        System.out.println("Capacity After Adding 4 Elements : "+vector.capacity());
        
        vector.addElement(5);
        System.out.println("Current Capacity : "+vector.capacity());
        
        vector.addElement(6);
        vector.addElement(7);
        System.out.println("Current Capacity : "+vector.capacity());
        
        System.out.println("First Element : "+vector.firstElement());
        System.out.println("Last Element : "+vector.lastElement());
        
        if(vector.contains(9))
        	System.out.println("Vector Contains 9.");
        else 
        	System.out.println("Vector does not contain 9.");
        
        //Using Enumeration to access elements in vectotr
        Enumeration<Integer> vEnum = vector.elements();
        
        System.out.println("\nElements In Vector.");
        while(vEnum.hasMoreElements())
        	System.out.print(vEnum.nextElement()+" ");
        
        System.out.println();

	}

}
