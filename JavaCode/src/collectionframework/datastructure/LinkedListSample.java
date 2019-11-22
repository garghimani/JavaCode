package collectionframework.datastructure;

import java.util.LinkedList;
import java.util.List;

class Address{
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n, String s, String c, String st, String cd){
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
		
	}
	
	public String toString() {
		
		return name+"\n"+street+"\n"+city+"\n"+state+"\n"+code;
	}
	
}


public class LinkedListSample {

	public static void main(String[] args) {

       LinkedList<String> ll = new LinkedList<String>();
       
       
       ll.add("A");
       ll.add("I");
       ll.add("E");
       ll.add("O");
       ll.add("U");
       ll.add("Hi");
       ll.add("Hello");
       ll.addFirst("First Element");
       ll.addLast("Last Element");
       
		System.out.println("Contents in the linked list : "+ll);
		
		ll.remove("Hi");
		ll.remove("I");
		
		System.out.println("First and Last Elements are : "+ll.getFirst()+ " "+ll.getLast());
		
		System.out.println("Contents in the linked list after removing elements : "+ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Contents in the linked list after removing first and last elements : "+ll);
		
		String value = ll.get(2);
		ll.set(2,value+" Changed");
		
		System.out.println("Contents in the linked list after modification : "+ll);
	
	//Storing User Defined Classes In Collection
		System.out.println();
		System.out.println("------------ STORING USER DEFINED CLASSES IN COLLECTION ----------------------");
		List<Address> list = new LinkedList<>(); // Using Class as the Generics
		list.add(new Address("MR.ABC","20430 VIA PAVISO","CUPERTINO","CA","95014"));
		list.add(new Address("MR.XYZ","123 TIMBERLAND ROAD","SAN JOSE","CA","95134"));
		list.add(new Address("MS.GEF","70 BROOKLYN STREET","FREMONT","CA","95004"));
		
		for(Address element : list)
			System.out.println(element + "\n");
		
		System.out.println();
	
	
	
	
	
	
	}

}
