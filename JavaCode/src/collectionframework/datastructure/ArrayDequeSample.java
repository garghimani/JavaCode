package collectionframework.datastructure;

import java.util.ArrayDeque;

public class ArrayDequeSample {

	public static void main(String[] args) {
		ArrayDeque<String> arraydeque = new ArrayDeque<String>();
		
		System.out.println("Initial Size : "+arraydeque.size());
		
		arraydeque.push("C");
		arraydeque.push("Z");
		arraydeque.push("W");
		arraydeque.push("A");
		arraydeque.push("R");
		arraydeque.push("E");
		arraydeque.push("T");
		arraydeque.push("I");
		
		System.out.println("Size After Adding Elements : "+arraydeque.size());
		System.out.println("First Element : "+arraydeque.peekFirst());
		System.out.println("Last Element : "+arraydeque.peekLast());
		
		arraydeque.removeFirst();
		arraydeque.removeLast();
		
		System.out.println("Size After Removing Elements : "+arraydeque.size());

		System.out.println("Popping the stack.");
		
		while(arraydeque.peek() != null)
			System.out.println(arraydeque.pop());
		
		System.out.println();
		
	}

}
