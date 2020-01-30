package collectionframework.datastructuredoublylinkedlist;

public class InsertNode {

	Node head = null, tail = null;
	public int size = 0;

	static class Node {
		int data;
		Node previous, next;

		Node(int data) {
			this.data = data;
		}
	}

	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = tail = newNode;
			newNode.previous = null;
			newNode.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
		size++;
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty..");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void addStartNode(int start) {
		Node startNode = new Node(start);
		if (head == null) {
			head = tail = startNode;
			startNode.previous = null;
			startNode.next = null;
		} else {
			startNode.next = head;
			head.previous = startNode;
			head = startNode;
			startNode.previous = null;
		}
		size++;
		display();
	}

	public void addEndNode(int end) {
		Node endNode = new Node(end);
		if (head == null) {
			head = tail = endNode;
			endNode.previous = null;
			endNode.next = null;
		} else {
			tail.next = endNode;
			endNode.previous = tail;
			tail = endNode;
			tail.next = null;
		}
		size++;
		display();
	}

	public void addMidNode(int mid) {
		Node midNode = new Node(mid);
		if (head == null) {
			head = tail = midNode;
			midNode.previous = null;
			midNode.next = null;
		} else {
			int midCount = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			Node current = head, temp = null;
			for (int i = 1; i < midCount; i++) {
				current = current.next;
			}
			System.out.println(current.data);
			// Temp points to the next node to current.
			temp = current.next;
			temp.previous = current;
			// New Node will added between current and temp.
			current.next = midNode;
			midNode.previous = current;
			midNode.next = temp;
			temp.previous = midNode;
		}
		size++;
		display();
	}

	public static void main(String[] args) {

		InsertNode insert = new InsertNode();
		insert.addNode(1);
		insert.addNode(2);
		insert.addNode(3);
		insert.addNode(4);
		System.out.println("Original List..");
		insert.display();
		System.out.println("After inserting element in the start..");
		insert.addStartNode(0);
		System.out.println("After inserting element at the end..");
		insert.addEndNode(5);
		System.out.println("After inserting element at the middle..");
		insert.addMidNode(7);
	}

}
