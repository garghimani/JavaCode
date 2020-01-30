package collectionframework.datastructuredoublylinkedlist;

public class DeleteNodes {

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
			System.out.println("List is empty..");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void deleteStartNode() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		} else {
			if (head != tail) {
				head = head.next;
				head.previous = null;
			} else {
				head = tail = null;
			}
			display();
		}
		size--;
	}

	public void deleteEndNode() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		} else {
			if (head != tail) {
				tail = tail.previous;
				tail.next = null;
			} else {
				head = tail = null;
			}
			display();
		}
		size--;
	}

	public void deleteMidNode() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		} else {
			Node current = head;
			int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			for (int i = 1; i < mid; i++) {
				current = current.next;
			}
			if (current == head) {
				head = current.next;
			} else if (current == tail) {
				tail = tail.previous;
			} else {
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
			current = null;
			display();
		}
	}

	public static void main(String[] args) {

		DeleteNodes delNode = new DeleteNodes();
		delNode.addNode(1);
		delNode.addNode(2);
		delNode.addNode(3);
		delNode.addNode(4);
		delNode.addNode(5);
		System.out.println("Original List..");
		delNode.display();
		System.out.println("After deleting first element..");
		delNode.deleteStartNode();
		System.out.println("After deleting last element..");
		delNode.deleteEndNode();
		System.out.println("After deleting middle element..");
		delNode.deleteMidNode();

	}

}
