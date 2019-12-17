package collectionframework.datastructure;

public class QueueImplementation {

	private int capacity;
	int queueArr[];
	int front = 0;
	int rear = -1;
	int currentSize = 0;

	public QueueImplementation(int size) {
		this.capacity = size;
		queueArr = new int[this.capacity];
	}

	public boolean isQueueFull() {
		boolean status = false;
		if (currentSize == capacity) {
			status = true;
		}
		return status;
	}

	public boolean isQueueEmpty() {
		boolean status = false;
		if (currentSize == 0) {
			status = true;
		}
		return status;
	}

	public void enqueue(int item) {
		if (isQueueFull()) {
			System.out.println("Queue is full. Unable to add item : " + item);
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = item;
			currentSize++;
			System.out.println("Item :" + item + " pushed to Queue.");
		}
	}

	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty. Unable to remove item.");
		} else {

			front++;
			if (front == capacity - 1) {
				System.out.println("Pop Operation done. Item removed : " + queueArr[front - 1]);
				front = 0;
			} else {
				System.out.println("Item removed : " + queueArr[front - 1]);
			}
			currentSize--;
		}

	}

	public static void main(String[] args) {

		QueueImplementation queueImpl = new QueueImplementation(4);

		queueImpl.enqueue(10);
		queueImpl.dequeue();
		queueImpl.enqueue(20);
		queueImpl.enqueue(30);
		queueImpl.enqueue(40);
		queueImpl.dequeue();
		queueImpl.dequeue();
		queueImpl.enqueue(50);
		queueImpl.dequeue();
		queueImpl.enqueue(60);
		queueImpl.enqueue(70);
		queueImpl.enqueue(80);
		queueImpl.enqueue(90);

	}

}
