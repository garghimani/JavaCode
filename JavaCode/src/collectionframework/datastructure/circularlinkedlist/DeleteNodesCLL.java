package collectionframework.datastructure.circularlinkedlist;

public class DeleteNodesCLL {

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

	public void deleteStartNode() {
		if (head == null) {
			return;
		} else {
			if (head != tail) {
				head = head.next;
				tail.next = head;
				display();
			} else {
				head = tail = null;
			}
		}
	}

	public void deleteEndNode() {
		if (head == null) {
			return;
		} else {
			if (head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				current.next = head;
				display();
			} else {
				head = tail = null;
			}
		}
	}

	public void deleteMidNode() {
		Node current;
		Node temp;
		if (head == null) {
			return;
		} else {
			int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			if (head != tail) {
				current = head;
				temp = null;
				for (int i = 1; i < mid - 1; i++) {
					temp = current;
					current = current.next;
				}
				if (current != null) {
					temp.next = current.next;
					current = null;
					display();
				} else {
					head = tail = current.next;
					tail.next = head;
					current = null;
					display();
				}
			} else {
				head = tail = null;
			}
		}

	}

	public static void main(String[] args) {

		DeleteNodesCLL delNode = new DeleteNodesCLL();
		delNode.addNode(1);
		delNode.addNode(2);
		delNode.addNode(3);
		delNode.addNode(4);
		delNode.addNode(5);
		delNode.addNode(6);
		delNode.addNode(7);
		System.out.println("Original List..");
		delNode.display();
		System.out.println("After removing first node..");
		delNode.deleteStartNode();
		System.out.println("After removing last node..");
		delNode.deleteEndNode();
		System.out.println("After removing middle node..");
		delNode.deleteMidNode();

	}

}
