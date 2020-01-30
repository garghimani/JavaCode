package collectionframework.datastructure.singlylinkedlist;

public class RemoveDuplicateNodes {
	
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
		if(head == null) {
			System.out.println("Given singly linked list is empty.");
			return;
		}
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void removeDuplicate() {
		Node current = head;
		Node temp = null;
		Node index = null;
		if(head == null) {
			return;
		}
		else {
			while(current != null) {
				temp = current;
				index = current.next;
				while(index != null) {
					if(current.data == index.data) {
						temp.next = index.next;
					}
					else {
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}
			display();
		}
	}

	public static void main(String[] args) {
		
		RemoveDuplicateNodes remDupnode = new RemoveDuplicateNodes();
		remDupnode.addNode(1);
		remDupnode.addNode(2);
		remDupnode.addNode(3);
		remDupnode.addNode(2);
		remDupnode.addNode(4);
		remDupnode.addNode(1);
		remDupnode.addNode(2);
		System.out.println("Original List..");
		remDupnode.display();
		System.out.println("After removing duplicates..");
		remDupnode.removeDuplicate();
		

	}

}
