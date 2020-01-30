package collectionframework.datastructure.circularlinkedlist;

public class InsertNodeCLL {

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
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}
		size++;
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty..");
			return;
		} else {
			do {
				System.out.print(current.data + " ");
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public void addStartNode(int start) {
		Node startNode = new Node(start);
		if (head == null) {
			head = startNode;
			tail = startNode;
			startNode.next = head;
			display();
		} else {
			tail.next = startNode;
			startNode.next = head;
			head = startNode;
			display();
		}
		size++;
	}

	public void addEndNode(int end) {
		Node endNode = new Node(end);
		if (head == null) {
			head = endNode;
			tail = endNode;
			endNode.next = head;
			display();
		} else {
			tail.next = endNode;
			tail = endNode;
			endNode.next = head;
			display();
		}
		size++;
	}

	public void addMidNode(int mid) {
		Node midNode = new Node(mid);
		Node temp, current;
		if (head == null) {
			head = midNode;
			tail = midNode;
			midNode.next = head;
			display();
		} else {
			int middle = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			temp = head;
			current = null;
			for (int i = 0; i < mid; i++) {
				current = temp;
				temp = temp.next;
			}
			current.next = midNode;
			midNode.next = temp;
			display();
		}
		size++;
	}

	public static void main(String[] args) {

		InsertNodeCLL insertNode = new InsertNodeCLL();
		insertNode.addNode(1);
		insertNode.addNode(2);
		System.out.println("Original List..");
		insertNode.display();
		System.out.println("After Adding Node at the start..");
		insertNode.addStartNode(0);
		System.out.println("After Adding Node in the middle..");
		insertNode.addMidNode(5);
		System.out.println("After Adding Node at the end..");
		insertNode.addEndNode(3);
		
	}

}
