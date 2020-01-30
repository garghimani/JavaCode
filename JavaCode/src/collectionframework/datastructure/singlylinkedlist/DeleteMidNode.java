package collectionframework.datastructure.singlylinkedlist;

public class DeleteMidNode {

	public Node head = null;
	public Node tail = null;
	public int size = 0;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//Method to add nodes to the list
	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	//Method to display all nodes
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty..");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	//Method to delete the middle of the node
	public void deleteMidNode() {
		Node temp, current;
		if (head == null) {
			System.out.println("List is empty..Nothing to delete..");
			return;
		} else {
			int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			if (head != tail) {
				temp = head;
				current = null;
				for (int i = 0; i < mid - 1; i++) {
					current = temp;
					temp = temp.next;
				}
				if (current != null) {
					current.next = temp.next;
					temp = null;
					System.out.println("After deleting mid node..");
					display();
				} else {
					head = tail = temp.next;
					temp = null;
					System.out.println("After deleting mid node..");
					display();
				}
			} else {
				head = tail = null;
			}
		}
	}

	public static void main(String[] args) {

		DeleteMidNode midNode = new DeleteMidNode();
		midNode.addNode(1);
		midNode.addNode(2);
		midNode.addNode(3);
		midNode.addNode(4);
		midNode.addNode(5);
		System.out.println("Original List...");
		midNode.display();
		midNode.deleteMidNode();

	}
}
