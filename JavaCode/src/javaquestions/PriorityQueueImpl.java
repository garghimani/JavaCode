package javaquestions;

import java.util.*;

public class PriorityQueueImpl {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("John");
		queue.add("Leo");
		queue.add("Tom");
		queue.add("Susan");

		System.out.println("Elements in the Priority Queue are : ");
		System.out.println("USING FOREACH LOOP");
		System.out.println("-------------------");
		for (String str : queue) {
			System.out.println(str);
		}

		System.out.println();
		System.out.println("First Element : " + queue.peek());
		System.out.println("Last Element : " + queue.poll());

		System.out.println();
		System.out.println("USING ITERATOR");
		System.out.println("--------------");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.add("Tina");
		queue.add("Alex");
		queue.add("Elena");

		System.out.println();
		System.out.println("Using forEach() METHOD ");
		System.out.println("---------------");
		queue.forEach((data) -> {
			System.out.println(data);
		});
		
		System.out.println();
		System.out.println("Checking if the element is present :"+queue.contains("Tom"));

	}

}
