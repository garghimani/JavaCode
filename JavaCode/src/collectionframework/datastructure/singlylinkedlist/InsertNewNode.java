package collectionframework.datastructure.singlylinkedlist;

public class InsertNewNode {

	public Node head = null;
	public Node tail = null;
	public int size = 0;

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
		size++;
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void addStartNode(int first) {
		Node firstNode = new Node(first);
		if (head == null) {
			head = firstNode;
			tail = firstNode;
		} else {
			Node temp = head;
			head = firstNode;
			head.next = temp;
			display();
		}
		size++;
	}

	public void addEndNode(int end) {
		Node endNode = new Node(end);
		if (head == null) {
			head = endNode;
			tail = endNode;
		} else {
			tail.next = endNode;
			tail = endNode;
			display();
		}
		size++;
	}

	public void addmiddleNode(int middle) {
		Node midNode = new Node(middle);
		if (head == null) {
			head = midNode;
			tail = midNode;
		} else {
			int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			Node current = null, temp = head;
			for (int i = 0; i < mid; i++) {
				current = temp;
				temp = temp.next;
			}
			current.next = midNode;
			midNode.next = temp;
			display();
		}

	}

	public static void main(String[] args) {

		InsertNewNode newNode = new InsertNewNode();
		newNode.addNode(2);
		newNode.addNode(3);
		newNode.addNode(4);
		System.out.println("Original List..");
		newNode.display();
		System.out.println("After Adding Node at starting..");
		newNode.addStartNode(1);
		System.out.println("After Adding Node at the end...");
		newNode.addEndNode(5);
		System.out.println("After Adding Node at the middle..");
		newNode.addmiddleNode(9);

	}

}
