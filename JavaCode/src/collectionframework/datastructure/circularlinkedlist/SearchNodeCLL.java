package collectionframework.datastructure.circularlinkedlist;

public class SearchNodeCLL {
	
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
			System.out.println("List is empty ..");
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
	
	public void searchNode(int data) {
		int i = 1;
		Node current = head;
		boolean flag = false;
		if(head == null) {
			return;
		}
		else {
			do {
				if(current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}while(current != head);
			if(flag) {
				System.out.println("The element "+current.data+" is present at position : "+i);
			}
			else {
				System.out.println("The element is not in the list.");
			}
		}
		
	}

	public static void main(String[] args) {
		
		SearchNodeCLL searchNode = new SearchNodeCLL();
		searchNode.addNode(1);
		searchNode.addNode(2);
		searchNode.addNode(3);
		searchNode.addNode(4);
		searchNode.addNode(5);
		System.out.println("Original List..");
		searchNode.display();
		System.out.println("Finding the element 2 ..");
		searchNode.searchNode(2);
		
	}

}
