package collectionframework.datastructuredoublylinkedlist;

public class ConvertBinaryTreeToDLL {
	
	Node root;
	Node head = null, tail = null;
	
	static class Node{
		int data;
		Node left , right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void convertBTToDLL(Node node) {
		if(node == null) {
			return;
		}
		convertBTToDLL(node.left);
		if(head == null) {
			head = tail = node;
		}
		else {
			tail.right = node;
			node.left = tail;
			tail = node;
		}		
		convertBTToDLL(node.right);
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Displaying the list ...");
			while(current != null) {
				System.out.print(current.data+" ");
				current = current.right;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		ConvertBinaryTreeToDLL binaryToDLL = new ConvertBinaryTreeToDLL();
		binaryToDLL.root = new Node(1);
		binaryToDLL.root.left = new Node(2);
		binaryToDLL.root.left.left = new Node(4);
		binaryToDLL.root.left.right = new Node(5);
		binaryToDLL.root.right = new Node(3);
		binaryToDLL.root.right.left = new Node(6);
		binaryToDLL.root.right.right = new Node(7);
		binaryToDLL.convertBTToDLL(binaryToDLL.root);
		binaryToDLL.display();

	}

}
