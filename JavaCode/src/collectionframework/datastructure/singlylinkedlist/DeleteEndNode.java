package collectionframework.datastructure.singlylinkedlist;

public class DeleteEndNode {
	
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
	
	//Method to add Nodes to the list
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
	
	//Method to display all Nodes
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty..");
			return;
		}
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	//Method to delete end node
	public void deleteEndNode() {
	//	Node endNode = tail;
		if(head == null) {
			System.out.println("List is empty..");
			return;
		}
		else {
			if(head != tail) {
				Node current = head;
				while(current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
				display();
			}
			else {
				head = tail = null;
			}
		}
		
	}

	public static void main(String[] args) {
		
		DeleteEndNode endNode = new DeleteEndNode();
		endNode.addNode(1);
		endNode.addNode(2);
		endNode.addNode(3);
		endNode.addNode(4);
		System.out.println("Original List..");
		endNode.display();
		System.out.println("After deleting end node..");
		endNode.deleteEndNode();

	}

}
