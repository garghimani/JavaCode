package collectionframework.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;

public class DiffOddEvenLevel {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public Node root;
	
	DiffOddEvenLevel(){
		root = null;
	}
	
	public int oddEvenDiff() {
		int oddLevel = 0;
		int evenLevel = 0;
		int diffOddEven = 0;
		int nodesInLevel = 0;
		int currentLevel = 0;
		Queue<Node> queue = new LinkedList<Node>();
		
		if(root == null) {
			System.out.println("Tree is empty..");
			return 0;
		}
		else {
			queue.add(root);
			currentLevel++;
			while(queue.size() != 0) {
				nodesInLevel = queue.size();
				while(nodesInLevel > 0) {
					Node current = queue.remove();
					if(currentLevel %2 == 0) {
						evenLevel += current.data;
					}
					else {
						oddLevel += current.data;
					}
					if(current.left != null) {
						queue.add(current.left);
					}
					if(current.right != null) {
						queue.add(current.right);
					}
					nodesInLevel--;
				}
				currentLevel++;
			}
			diffOddEven = Math.abs(oddLevel - evenLevel);
		}
		return diffOddEven;
		
	}

	public static void main(String[] args) {
		
		DiffOddEvenLevel diff = new DiffOddEvenLevel();
		diff.root = new Node(1);
		diff.root.left = new Node(2);
		diff.root.right = new Node(3);
		diff.root.left.left = new Node(4);
		diff.root.right.left = new Node(5);
		diff.root.right.right = new Node(6);
		System.out.println("Difference between odd and even level nodes is : "+diff.oddEvenDiff());

	}

}
