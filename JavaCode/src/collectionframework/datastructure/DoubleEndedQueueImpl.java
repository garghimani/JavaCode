package collectionframework.datastructure;

import java.util.*;

public class DoubleEndedQueueImpl {
	
	private List<Integer> dequeue = new ArrayList<>();
	
	public void insertFront(int item) {
		System.out.println("Inserting element in front : "+item);
		dequeue.add(0,item);
		System.out.println(dequeue);		
	}
	
	public void insertRear(int item) {
		System.out.println("Inserting element in rear : "+item);
		dequeue.add(item);
		System.out.println(dequeue);		
	}
	
	public void removeFront() {
		if(dequeue.isEmpty()) {
			System.out.println("The Queue is empty.");
			return;
		}
		int remove = dequeue.remove(0);
		System.out.println("Element removed from front : "+remove);
		System.out.println(dequeue);
	}
	
	public void removeRear() {
		if(dequeue.isEmpty()) {
			System.out.println("The Queue is empty.");
			return;
		}
		int remove = dequeue.remove(dequeue.size()-1);
		System.out.println("Element removed from rear : "+remove);
		System.out.println(dequeue);
	}
	
	public int peekFront() {
		int item = dequeue.get(0);
		System.out.println("Element at front : "+item);
		return item;
	}
	
	public int peekRear() {
		int item = dequeue.get(dequeue.size()-1);
		System.out.println("Element at rear : "+item);
		return item;
	}

	public static void main(String[] args) {
		
		DoubleEndedQueueImpl doubleQueue = new DoubleEndedQueueImpl();
		doubleQueue.insertFront(10);
		doubleQueue.insertRear(20);
		doubleQueue.peekFront();
		doubleQueue.peekRear();
		doubleQueue.removeFront();
		doubleQueue.removeRear();
		

	}

}
