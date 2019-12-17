package collectionframework.datastructure;

public class PriorityQueueImpl {

	@SuppressWarnings("rawtypes")
	private Comparable[] pQueue;
	private int index;

	public PriorityQueueImpl(int capacity) {
		pQueue = new Comparable[capacity];
	}

	public void insert(Comparable item) {
		if (index == pQueue.length) {
			System.out.println("Queue is Full.");
			return;
		}
		pQueue[index] = item;
		index++;
		System.out.println("Adding Element : " + item);
	}

	@SuppressWarnings("unchecked")
	public Comparable remove() {
		if (index == 0) {
			System.out.println("Queue is Empty.");
			return null;
		}
		int maxIndex = 0;
		for (int i = 1; i < index; i++) {
			if (pQueue[i].compareTo(pQueue[maxIndex]) > 0) {
				maxIndex = i;
			}
		}
		Comparable result = pQueue[maxIndex];
		System.out.println("Removing Element : " + result);
		index--;
		pQueue[maxIndex] = pQueue[index];
		return result;
	}

	public static void main(String[] args) {

		PriorityQueueImpl pQueueImpl = new PriorityQueueImpl(5);
		/*
		 * pQueueImpl.insert(10); pQueueImpl.insert(5); pQueueImpl.insert(25);
		 * pQueueImpl.insert(82); pQueueImpl.insert(15);
		 */
		pQueueImpl.insert("ae");
		pQueueImpl.insert("xyz");
		pQueueImpl.insert("x");
		pQueueImpl.insert("aef");
		pQueueImpl.insert("aeF");
		pQueueImpl.insert("zxe");
		//pQueueImpl.insert(34);
		pQueueImpl.remove();
		pQueueImpl.remove();
		pQueueImpl.remove();
		pQueueImpl.remove();
		pQueueImpl.remove();
		pQueueImpl.remove();

	}

}
