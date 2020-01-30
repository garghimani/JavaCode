package collectionframework.datastructure.singlylinkedlist;

public class SearchNode {

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
			System.out.println("Given singly linked list is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void findNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag) {
			System.out.println("The element " + current.data + " is present at the position : " + i);
		} else {
			System.out.println("The element is not present in the list.");
		}
	}

	public static void main(String[] args) {

		SearchNode search = new SearchNode();
		search.addNode(10);
		search.addNode(20);
		search.addNode(30);
		search.addNode(40);
		search.addNode(50);
		System.out.println("Original List..");
		search.display();
		System.out.println("Search the element 20 and 40..");
		search.findNode(20);
		search.findNode(40);

	}

}
