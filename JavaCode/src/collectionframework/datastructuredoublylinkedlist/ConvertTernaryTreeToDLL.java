package collectionframework.datastructuredoublylinkedlist;

public class ConvertTernaryTreeToDLL {

	public Node root;
	Node head = null, tail = null;

	static class Node {
		int data;
		Node left, middle, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.middle = null;
			this.right = null;
		}
	}

	public void convertTTToDLL(Node node) {
		if (node == null) {
			return;
		}
		Node left = node.left;
		Node middle = node.middle;
		Node right = node.right;
		if (head == null) {
			head = tail = node;
			head.left = null;
			node.middle = null;
			tail.right = null;
		} else {
			tail.right = node;
			node.left = tail;
			node.middle = null;
			tail = node;
			tail.right = null;
		}
		convertTTToDLL(left);
		convertTTToDLL(middle);
		convertTTToDLL(right);
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Elements in the list...");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.right;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ConvertTernaryTreeToDLL ternaryToDLL = new ConvertTernaryTreeToDLL();
		ternaryToDLL.root = new Node(5);
		ternaryToDLL.root.left = new Node(10);
		ternaryToDLL.root.left.left = new Node(20);
		ternaryToDLL.root.left.middle = new Node(30);
		ternaryToDLL.root.left.right = new Node(40);
		ternaryToDLL.root.middle = new Node(12);
		ternaryToDLL.root.middle.left = new Node(24);
		ternaryToDLL.root.middle.middle = new Node(36);
		ternaryToDLL.root.middle.right = new Node(48);
		ternaryToDLL.root.right = new Node(15);
		ternaryToDLL.root.right.left = new Node(30);
		ternaryToDLL.root.right.middle = new Node(45);
		ternaryToDLL.root.right.right = new Node(60);
		ternaryToDLL.convertTTToDLL(ternaryToDLL.root);
		ternaryToDLL.display();

	}

}
