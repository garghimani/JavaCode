package collectionframework.datastructure.circularlinkedlist;

import collectionframework.datastructure.circularlinkedlist.SearchNodeCLL.Node;

public class RemoveDuplicatesCLL {

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

	public void removeDuplicateNode() {
		Node current = head;
		Node temp = null, index = null;
		if (head == null) {
			return;
		} else {
			do {
				temp = current;
				index = current.next;
				while (index != head) {
					if (temp.data == index.data) {
						temp.next = index.next;
					} else {
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			} while (current.next != head);
			display();
		}
	}

	public static void main(String[] args) {

		RemoveDuplicatesCLL dupNode = new RemoveDuplicatesCLL();
		dupNode.addNode(1);
		dupNode.addNode(2);
		dupNode.addNode(2);
		dupNode.addNode(3);
		dupNode.addNode(3);
		System.out.println("Original List..");
		dupNode.display();
		System.out.println("After Removing Duplicates..");
		dupNode.removeDuplicateNode();

	}

}
