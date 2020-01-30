package collectionframework.datastructure.circularlinkedlist;

public class CircularLinkedListExample {

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
			System.out.println("List is empty.");
			return;
		} else {
			do {
				System.out.print(current.data + " ");
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		CircularLinkedListExample cll = new CircularLinkedListExample();
		cll.addNode(1);
		cll.addNode(2);
		cll.addNode(3);
		cll.addNode(4);
		cll.addNode(5);
		System.out.println("Given circular linked list is ..");
		cll.display();

	}

}
