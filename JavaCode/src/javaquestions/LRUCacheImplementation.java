package javaquestions;

import java.util.HashMap;

public class LRUCacheImplementation {
	
	HashMap<Integer, Node> hashmap = new HashMap<Integer,Node>();
	Node head = null, end = null;
	int capacity;
	
	LRUCacheImplementation(int capacity){
		this.capacity = capacity;
	}
	
	static class Node{
		int value, key;
		Node previous, next;
		
		Node(int value, int key){
			this.key = key;
			this.value = value;
		}
	}
	
	//Method to make passed node as head
	public void setHead(Node node) {
		//Shifting the head to make new node as head
		node.next = head;
		node.previous = null;
		if(head != null) {
			head.previous = node;
		}
		head = node;
		if(end == null) {
			end = head;
		}
	}
	
	//Method to delete Node
	public void delete(Node node) {
		if(node.previous != null) {
			node.previous.next = node.next;
		}
		else {
			head = node.next;
		}
		
		if(node.next != null) {
			node.next.previous = node.previous;
		}
		else {
			end = node.previous;
		}
	}
	
	public int get(int key) {
		if(hashmap.containsKey(key)) {
			Node n = hashmap.get(key);
			delete(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}
	
	public void set(int key, int value) {
		if(hashmap.containsKey(key)) {
			Node old = new Node(key, value);
			old.value = value;
			delete(old);
			setHead(old);
		}else {
			Node newNode = new Node(key,value);
			if(hashmap.size()>= capacity) {
				delete(end);
				setHead(newNode);
			}else {
				setHead(newNode);
			}
			hashmap.put(key, newNode);
		}
	}

	public static void main(String[] args) {
		
		LRUCacheImplementation lrucache = new LRUCacheImplementation(4);
		lrucache.set(1, 100);
		lrucache.set(10, 99);
		lrucache.set(15, 98);
		lrucache.set(10, 97);
		lrucache.set(12, 96);
		lrucache.set(18, 95);
		lrucache.set(1, 94);
 
		System.out.println("The nodes updated are : ");
		System.out.println(lrucache.get(1));
		System.out.println(lrucache.get(10));
		System.out.println(lrucache.get(15));		

	}

}