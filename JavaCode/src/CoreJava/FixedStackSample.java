package CoreJava;

import java.util.Scanner;

class FixedStack implements IntStack {

	private int stck[];
	private int tos;

	FixedStack(int size) {

		stck = new int[size];
		tos = -1;
	}

	public void push(int item) {

		if (tos == stck.length - 1)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;

	}

	public int pop() {

		if (tos < 0) {
			System.out.println("Stack Underflow.");
			return 0;
		}

		else {

			return stck[tos--];

		}

	}

}

public class FixedStackSample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int stacksize;
		boolean exit = false;

		System.out.println("Enter the size of Stack .");
		stacksize = sc.nextInt();
		int stackarr[] = new int[stacksize];
		FixedStack fixedstack = new FixedStack(stacksize);

		System.out.println("Enter Integer Data :");
		for (int i = 0; i < stacksize; i++) {

			stackarr[i] = sc.nextInt();
			fixedstack.push(stackarr[i]);

		}

		while (!exit) {

			System.out.println("Enter the top of stack between 0 and " + (stacksize - 1));
			int index = sc.nextInt();

			if (index < 0 || index >= stacksize)
				System.out.println("Valid Range is between 0 and " + (stacksize - 1));
			else {
				System.out.println("The data in the stack.");

				for (int j = 0; j < stackarr.length; j++) {

					System.out.println("[" + j + "] :" + fixedstack.pop());
					exit = true;
					sc.close();

				}
			}
		}

	}

}
