package collectionframework.datastructure;

import java.util.NoSuchElementException;

public class DoublyLinkedListImpl<E> {
	
	Node head;
	Node tail;
	int size;
	
	public DoublyLinkedListImpl() {
		size = 0;
	}
	
	private class Node{
		E element;
		Node next;
		Node prev;
		
		public Node(E element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}		
	}
	
	public int size() {
		return size;
	} 
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addFirst(E element) {
		Node tmp = new Node(element, head, null);
		if(head != null) {head.prev = tmp;}
		head = tmp;
		if(tail == null) {tail = tmp;}
		size++;
		System.out.println("AddingFirst  : "+element);		
	}
	
	public void addLast(E element) {
		Node tmp = new Node(element, null, tail);
		if(tail != null) {tail.next = tmp;}
		tail = tmp;
		if(head == null) {head = tmp;}
		size++;
		System.out.println("AddingLast : "+element);
	}
	
	public void iterateForward() {
		System.out.println("Iterating Forward....");
		Node tmp = head;
		while(tmp != null) {
			System.out.println(tmp.element);
			tmp = tmp.next;
		}
	}
	
	public void iterateBackward() {
		System.out.println("Iterating Backward...");
		Node tmp = tail;
		while(tmp != null) {
			System.out.println(tmp.element);
			tmp = tmp.prev;
		}
	}
	
	public E removeFirst() {
		if(size == 0) {throw new NoSuchElementException();}
		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		System.out.println("DeletedFirst : "+tmp.element);
		return tmp.element;
	}
	
	public E removeLast() {
		if(size == 0) {throw new NoSuchElementException();}
		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		System.out.println("DeletingLast : "+tmp.element);
		return tmp.element;
	}	

	public static void main(String[] args) {
		
		DoublyLinkedListImpl<Integer> dll = new DoublyLinkedListImpl<Integer>();
		
		
        dll.addFirst(10);
        dll.addFirst(34);
        dll.addLast(56);
        dll.addLast(364);
        System.out.println("Size : "+dll.size);
        System.out.println("LinkedList Empty : "+dll.isEmpty());
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();		

	}

}
