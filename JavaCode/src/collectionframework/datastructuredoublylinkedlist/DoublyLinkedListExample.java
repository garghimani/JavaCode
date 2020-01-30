package collectionframework.datastructuredoublylinkedlist;

public class DoublyLinkedListExample {

	Node head = null, tail = null;

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
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
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

	// Counting the total nodes.
	public int countNodes() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	// Reversing the list.
	public void reverseList() {
		Node current = head, temp = null;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			temp = current.next;
			current.next = current.previous;
			current.previous = temp;
			current = current.previous;
		}
		temp = head;
		head = tail;
		tail = temp;
		display();
	}

	// Finding the Minimum value node in the list
	public int minNode() {
		Node current = head;
		int min;
		if (head == null) {
			System.out.println("List is empty");
			return 0;
		} else {
			min = head.data;
			while (current != null) {
				if (min > current.data) {
					min = current.data;
				}
				current = current.next;
			}
		}
		return min;
	}
	
	public int maxNode() {
		Node current = head;
		int max;
		if(head == null) {
			System.out.println("List is empty.");
			return 0;
		}
		else {
			max = head.data;
			while(current != null) {
				if(current.data > max) {
					max = current.data;
				}
				current = current.next;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		DoublyLinkedListExample dll = new DoublyLinkedListExample();
		dll.addNode(1);
		dll.addNode(2);
		dll.addNode(3);
		dll.addNode(4);
		dll.addNode(5);
		System.out.println("Original List..");
		dll.display();
		System.out.println("Total Nodes : " + dll.countNodes());
		System.out.println("Reverse List..");
		dll.reverseList();
		System.out.println("Minimum value node is : "+dll.minNode());
		System.out.println("Maximum value node is : "+dll.maxNode());
	}

}
