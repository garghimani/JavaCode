package collectionframework.datastructure.singlylinkedlist;

public class PalindromeLinkedList {
	
	public Node head = null;
	public Node tail = null;
	public int size = 0;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//Method to add nodes to the list
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
		size++;
	}
	
	//Method to reverse the nodes 
	public Node reverseList(Node temp) {
		Node current = temp;
		Node prevNode = null;
		Node nextNode = null;
		while(current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		}
		return prevNode;		
	}
	
	//Method to check if the list is palindrome
	public void isPalindromeLL() {
		Node current = head;
		boolean flag = true;
		int mid = (size%2 == 0) ? (size/2) : ((size+1)/2);
		for(int i = 1;i<mid;i++) {
			current = current.next;
		}
		Node revHead = reverseList(current.next);
		while(head != null && revHead != null) {
			if(head.data != revHead.data) {
				flag = false;
				break;
			}
			head = head.next;
			revHead = revHead.next;
		}
		if(flag) {
			System.out.println("Given singly linked list is Palindrome.");
		}
		else {
			System.out.println("Given singly linked list is not Palindrome.");
		}		
	}
	
	//Method to display the list
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

	public static void main(String[] args) {
		
		PalindromeLinkedList palindromeLL = new PalindromeLinkedList();
		palindromeLL.addNode(1);
		palindromeLL.addNode(2);
		palindromeLL.addNode(3);
		palindromeLL.addNode(2);
		palindromeLL.addNode(1);
		System.out.println("Original List..");
		palindromeLL.display();
		palindromeLL.isPalindromeLL();

	}

}
