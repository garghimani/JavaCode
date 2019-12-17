package collectionframework.datastructure;

public class StackImplementation {
	
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public StackImplementation(int size) {
		
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
		
	}
	
	public boolean isStackFull() {		
		return(top == stackSize-1);		
	}
	
	public boolean isStackEmpty() {		
		return(top == -1);		
	}
	
	public void push(int entry) throws Exception{
		
		if(this.isStackFull()) {
			throw new Exception("The Stack is Full.");
		}
		System.out.println("Adding : "+entry);
		this.stackArr[++top] = entry;
		
	}
	
	public int pop() throws Exception{
		
		if(this.isStackEmpty()) {
			throw new Exception("The Stack is Empty.");
		}
		
		int entry = this.stackArr[top--];
		System.out.println("Retrieving Data : "+entry);
		return entry;
	}
	
	public static void main(String[] args) {
		
		StackImplementation stackImpl = new StackImplementation(5);
		
		try {
			stackImpl.push(10);
			stackImpl.push(20);
			stackImpl.push(30);
			stackImpl.push(40);
			stackImpl.pop();
			stackImpl.push(50);	
			stackImpl.push(60);
			stackImpl.push(70);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
