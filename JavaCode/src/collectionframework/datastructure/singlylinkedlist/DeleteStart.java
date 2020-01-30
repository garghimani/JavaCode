package collectionframework.datastructure.singlylinkedlist;

public class DeleteStart {

	Node head;
	Node tail;

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
			System.out.println("Linked List is empty");
			return;
		}
		System.out.println("Original List..");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void deleteFirstNode() {
		Node firstNode = head;
		if (head == null) {
			System.out.println("List is empty..");
			return;
		} else {
			if (head != tail) {
				firstNode = head.next;
				System.out.println("After Deleting first node..");
				while (firstNode != null) {
					System.out.print(firstNode.data + " ");
					firstNode = firstNode.next;
				}
				System.out.println();
			} else {
				// If list contains only one element
				// It will delete that element and both head and tail point to null.
				head = tail = null;
			}
		}
	}

	public static void main(String[] args) {

		DeleteStart delStart = new DeleteStart();
		delStart.addNode(10);
		delStart.addNode(20);
		delStart.addNode(30);
		delStart.addNode(40);
		delStart.addNode(50);
		delStart.display();
		delStart.deleteFirstNode();

	}

}
