package collectionframework.datastructure;

public class SinglyLinkedListImpl<T> {

	private node<T> head;
	private node<T> tail;

	public void add(T element) {
		node<T> nd = new node<T>();
		nd.setValue(element);
		System.out.println("Adding Element : " + element);

		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public void addAfter(T element, T after) {
		node<T> tmp = head;
		node<T> refNode = null;
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			node<T> nd = new node<T>();
			nd.setValue(element);
			nd.setNextRef(tmp.getNextRef());
			if (tmp == tail) {
				tail = nd;
			}
			tmp.setNextRef(nd);
		} else {
			System.out.println("Unable to find the given element.");
		}
	}

	public void delete() {
		if (head == null) {
			System.out.println("Underflow....");
		}
		node<T> tmp = head;
		head = tmp.getNextRef();
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted Element : " + tmp.getValue());
	}

	public void deleteAfter(T after) {
		node<T> tmp = head;
		node<T> refNode = null;

		System.out.println("Traversing to all nodes....");

		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			tmp = refNode.getNextRef();
			refNode.setNextRef(tmp.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted... : " + tmp.getValue());
		} else {
			System.out.println("Unable to find the Element..");
		}
	}

	public void traverse() {
		node<T> tmp = head;
		System.out.println("Printing all Elements..");
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	public static void main(String[] args) {

		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		sl.addAfter(76, 54);
		sl.delete();
		sl.deleteAfter(76);
		sl.traverse();

	}

}

class node<T> implements Comparable<T> {

	private T value;
	private node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(node<T> nextRef) {
		this.nextRef = nextRef;
	}

	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}
