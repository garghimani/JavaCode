package collectionframework.datastructure.singlylinkedlist;

public class MinMaxNode {

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
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("Given singly linked list is empty.");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void minNode() {
		Node current = head;
		int min;
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			min = head.data;
			while (current != null) {
				if (min > current.data) {
					min = current.data;
				}
				current = current.next;
			}
			System.out.println("Minimum value node in the list is : " + min);
		}
	}

	public void maxNode() {
		Node current = head;
		int max;
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			max = head.data;
			while (current != null) {
				if (max < current.data) {
					max = current.data;
				}
				current = current.next;
			}
			System.out.println("Maximum value node in the list is : " + max);
		}
	}

	public static void main(String[] args) {

		MinMaxNode minMax = new MinMaxNode();
		minMax.addNode(3);
		minMax.addNode(1);
		minMax.addNode(7);
		minMax.addNode(4);
		minMax.addNode(5);
		System.out.println("Original List...");
		minMax.display();
		minMax.minNode();
		minMax.maxNode();
	}

}
