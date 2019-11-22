package collectionframework.datastructure;

import java.util.*;

public class MapSample {

	public static void main(String[] args) {
		
		Map<String , Integer> map = new TreeMap<>();
		
		map.put("John", 9);
		map.put("Den" , 2);
		map.put("Martha", 6);
		map.put("Alex", 5);
		map.put("Rachel", 7);
		map.put("Hazel", 3);
		map.put("Max", 10);
		map.put("Sam", 1);
		
		//List Displayed In Tree Map is sorted on the basis of key.
		System.out.println("--------------- TREE MAP ----------------------");
		System.out.println("Data In Tree Map : ");
		System.out.println("NAME : ROLLNO.");
		System.out.println("=====  =======");
		Set<Map.Entry<String , Integer>> mapentry = map.entrySet();
		
        for(Map.Entry<String , Integer> me : mapentry)
        	System.out.println(me.getKey() +" : "+me.getValue());
        
        System.out.println("--------------- HASH MAP ----------------------");
        
        Map<String , Integer> map1 = new HashMap<>();
		
		map1.put("John", 9);
		map1.put("Den" , 2);
		map1.put("Martha", 6);
		map1.put("Alex", 5);
		map1.put("Rachel", 7);
		map1.put("Hazel", 3);
		map1.put("Max", 10);
		map1.put("Sam", 1);
		
		Set<Map.Entry<String , Integer>> mapentry1 = map1.entrySet();
		
		//List Displayed In Hash Map is random
		System.out.println("Data In Hash Map : ");
		System.out.println("NAME : ROLLNO.");
		System.out.println("=====  =======");
		
        for(Map.Entry<String , Integer> me1 : mapentry1)
        	System.out.println(me1.getKey() +" : "+me1.getValue());
        
        
        System.out.println("--------------- LINKED HASH MAP ----------------------");
        
        Map<String , Integer> map2 = new LinkedHashMap<>();
		
		map2.put("John", 9);
		map2.put("Den" , 2);
		map2.put("Martha", 6);
		map2.put("Alex", 5);
	    map2.put("Rachel", 7);
	    map2.put("Hazel", 3); 
	    map2.put("Max", 10);
		map2.put("Sam", 1);
		 
		
		Set<Map.Entry<String , Integer>> mapentry2 = map2.entrySet();
		
		//List Displayed In Linked Hash Map is in the insertion order.
		System.out.println("Data In Linked Hash Map : ");
		System.out.println("NAME : ROLLNO.");
		System.out.println("=====  =======");
		
        for(Map.Entry<String , Integer> me2 : mapentry2)
        	System.out.println(me2.getKey() +" : "+me2.getValue());
        
        
	}

}
