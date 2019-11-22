package collectionframework.datastructure;

import java.util.EmptyStackException;
import java.util.*;

public class StackDemo {
	
	static void displaypush(Stack<Integer> st, int a) {
		
		st.push(a);
		System.out.println("push("+a+")");
		System.out.println("Stack : "+st);
		
	}
	
	static void displaypop(Stack<Integer> st) {
		
		System.out.print("pop ---->");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("Stack : "+st);
		
	}

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack : "+st);
		
		displaypush(st, 20);
		displaypush(st, 30);
		displaypush(st, 40);
		
		displaypop(st);
		displaypop(st);
		displaypop(st);
		
		try {
			
			displaypop(st);
		}
		catch(EmptyStackException e) {
			
			System.out.println("Empty Stack.");
		}

	}

}
