package javaquestions;

import java.util.*;

public class MergeSortedList {

	public static Node head = null, tail = null;

	static class Node {
		int data;
		Node next;
	}

	public static Node addNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		return newNode;
	}

	public static void display(Node current) {
		if (current == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public Node merge(Node one, Node two) {
		if (one == null) {
			return two;
		}
		if (two == null) {
			return one;
		}
		if (one.data < two.data) {
			one.next = merge(one.next, two);
			return one;

		} else {
			two.next = merge(one, two.next);
			return two;
		}

	}

	public static void main(String[] args) {

		MergeSortedList merge = new MergeSortedList();

		
		System.out.println("Using Linked List...");
		Node one = addNode(10);
		one.next = addNode(30);
		one.next.next = addNode(50);
		
		Node two = addNode(20);
		two.next = addNode(40);
		two.next.next = addNode(60);

		Node mergedList = merge.merge(one, two);
		display(mergedList);

		System.out.println();
		System.out.println("Using Linked List Collection Framework...");
		// Merging two sorted list
		List<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(30);
		list1.add(40);
		list1.add(60);

		List<Integer> list2 = new LinkedList<>();
		list2.add(20);
		list2.add(50);
		list2.add(70);
		list2.add(80);

		list1.addAll(list2);
		list1.sort(null);

		Iterator<Integer> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
