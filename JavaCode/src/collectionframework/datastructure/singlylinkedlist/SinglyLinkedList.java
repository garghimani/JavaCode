package collectionframework.datastructure.singlylinkedlist;

public class SinglyLinkedList {
	
	Node head;
	Node tail;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		if
		(head == null) {
			System.out.println("List is empty..");
			return;
		}
		System.out.println("Nodes of singlylinked list..");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList sList = new SinglyLinkedList();
		sList.addNode(10);
		sList.addNode(20);
		sList.addNode(30);
		sList.addNode(40);
		sList.display();

	}

}
