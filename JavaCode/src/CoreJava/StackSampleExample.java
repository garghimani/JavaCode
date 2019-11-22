package CoreJava;

class Stack{
	
	int stck[] = new int[10];
	int tos;
	
	Stack() {
		tos = -1;
	}
	
	void push(int item) {
		if(tos == 9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
	
	int pop() {
		
		if(tos<0) {
		   System.out.println("-----------------");
		   System.out.println("Stack Underflow");
		   System.out.println("Last item in Stack");
		   return 0;
		}    
		else
			return stck[tos--];
		
	}
	
}

public class StackSampleExample {

	public static void main(String[] args) {
		
     Stack mystack1 = new Stack();
     Stack mystack2 = new Stack();
     
     //push items in the stack
     for(int i = 0;i<=10;i++) mystack1.push(i);
     for(int i = 0;i<=10;i++) mystack2.push(i);
     
     System.out.println("=====================");
     
     //pop items from stack
     System.out.println("In Stack mystack1");
     for(int i = 0;i<=10;i++)
    	 System.out.println("Items in Stack :"+mystack1.pop());
     
     System.out.println("=====================");
     
     System.out.println("In Stack mystack2");
     for(int i = 0;i<=10;i++)
    	 System.out.println("Items in Stack :"+mystack2.pop());	
		
	}

}
