package javaquestions;

public class RemoveDuplicateSortedList {
	
	Node tail = null;
	Node head = null;
	
	static class Node {
		int data;
		Node previous, next;

		Node(int data) {
			this.data = data;
		}
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
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
	
	public void deleteDuplicate() {
		Node current = head;
		Node temp;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			temp = current;
			while(temp != null && temp.data == current.data) {
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;			
		}
		display();
	}

	public static void main(String[] args) {
		
		RemoveDuplicateSortedList sortList = new RemoveDuplicateSortedList();
		sortList.addNode(10);
		sortList.addNode(10);
		sortList.addNode(10);
		sortList.addNode(20);
		sortList.addNode(30);
		sortList.addNode(30);
		sortList.addNode(40);
		System.out.println("Original List ");
		System.out.println("---------------");
		sortList.display();
		System.out.println();
		System.out.println("After Removing Duplicates");
		System.out.println("-------------------------");
		sortList.deleteDuplicate();

	}

}
