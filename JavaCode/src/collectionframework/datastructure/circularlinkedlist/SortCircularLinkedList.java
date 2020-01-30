package collectionframework.datastructure.circularlinkedlist;

import collectionframework.datastructure.circularlinkedlist.RemoveDuplicatesCLL.Node;

public class SortCircularLinkedList {

	public Node head = null;
	public Node tail = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty ..");
			return;
		} else {
			do {
				System.out.print(current.data + " ");
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public void sort() {
		Node current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			do {
				index = current.next;
				while (index != head) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			} while (current.next != head);
			display();
		}
	}

	public static void main(String[] args) {

		SortCircularLinkedList sortList = new SortCircularLinkedList();
		sortList.addNode(1);
		sortList.addNode(4);
		sortList.addNode(2);
		sortList.addNode(6);
		sortList.addNode(3);
		sortList.addNode(5);
		System.out.println("Original List..");
		sortList.display();
		System.out.println("Sorted List..");
		sortList.sort();

	}

}
