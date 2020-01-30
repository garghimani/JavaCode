package collectionframework.datastructure.singlylinkedlist;

public class CountNodes {
	
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
	
	public void addNodes(int d) {
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
	
	public int countNodes() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	//method to reverse the list
	public void reverseList(Node current) {
		if(head == null) {
			System.out.println("List is empty..");
			return;
		}
		while(current.next == null) {
			System.out.print(current.data+" ");
			return;
		}
		reverseList(current.next);
		System.out.print(current.data+" ");
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("Singly Linked List is empty..");
			return;
		}
		System.out.println("Nodes of Singly Linked List are : ");
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		CountNodes countNode = new CountNodes();
		countNode.addNodes(1);
		countNode.addNodes(2);
		countNode.addNodes(3);
		countNode.addNodes(4);
		countNode.addNodes(5);
		countNode.display();
		System.out.println("Reverse List..");
		countNode.reverseList(countNode.head);
		System.out.println();
		System.out.println("Total number of nodes are : "+countNode.countNodes());

	}

}
