package collectionframework.datastructure.circularlinkedlist;

public class CountNodesCLL {
	
	public Node head = null;
	public Node tail = null;	
	
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
			newNode.next = head;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty..");
			return;
		}
		else {
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}
	
	public void countNodes() {
		Node current = head;
		int count = 0;
		do {
			current = current.next;
			count++;
		}while(current != head);
		System.out.println("Total Nodes : "+count);		
	}
	
	//Method to reverse order of the nodes
	public void reverseNodes(Node current) {
		if(current.next == head) {
			System.out.print(current.data+" ");
			return;
		}
		reverseNodes(current.next);
		System.out.print(current.data+" ");
	}

	public static void main(String[] args) {
		
		CountNodesCLL countNode = new CountNodesCLL();
		countNode.addNode(1);
		countNode.addNode(2);
		countNode.addNode(3);
		countNode.addNode(4);
		System.out.println("Original List..");
		countNode.display();
		System.out.println("Reverse List..");
		countNode.reverseNodes(countNode.head);
		System.out.println();
		countNode.countNodes();

	}

}
