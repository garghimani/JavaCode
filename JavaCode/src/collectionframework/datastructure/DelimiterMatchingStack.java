package collectionframework.datastructure;

public class DelimiterMatchingStack {

	public static void main(String[] args) {
		DelimiterMatchingStack mdm = new DelimiterMatchingStack();
		String expression = "{(a+b)*(c+d)}";
		boolean result = mdm.isDelimiterMatching(expression);
		System.out.println(expression + " == " + result);
		System.out.println();

		expression = "{(a+b)+[x*(c+d)]}";
		result = mdm.isDelimiterMatching(expression);
		System.out.println(expression + " == " + result);
		System.out.println();

		expression = "{(a+b)+[x*(c+d)}}";
		result = mdm.isDelimiterMatching(expression);
		System.out.println(expression + " == " + result);
		System.out.println();
		
		expression = "{(a+b";
		result = mdm.isDelimiterMatching(expression);
		System.out.println(expression + " == " + result);
		System.out.println();
		
		expression = "a+b)";
		result = mdm.isDelimiterMatching(expression);
		System.out.println(expression + " == " + result);
		System.out.println();

	}

	public boolean isDelimiterMatching(String inputExpr) {

		int stackSize = inputExpr.length();
		StackImpl mystack = new StackImpl(stackSize);

		for (int i = 0; i < inputExpr.length(); i++) {

			char ch = inputExpr.charAt(i);
			switch (ch) {
			case '[':
			case '{':
			case '(':
				mystack.push(ch);
				break;

			case ']':
			case '}':
			case ')':
				if (!mystack.isStackEmpty()) {
					char stackContent = mystack.pop();
					if ((ch == ']' && stackContent != '[') || (ch == '}' && stackContent != '{')
							|| (ch == ')' && stackContent != '(')) {

						System.out.println(" Mismatch Found Right Delimiter Missing: " + ch + " at " + i);
						return false;
					}
				} else {
					System.out.println("Mismatch Found Left Delimiter Missing: " + ch + " at " + i);
					return false;
				}
				break;
			default:
				break;
			}
		}

		if (!mystack.isStackEmpty()) {
			System.out.println("Right Delimiter Missing.");
			return false;
		}
		System.out.println();
		return true;

	}

}

class StackImpl {

	private int stackSize;
	private char[] stackArr;
	private int top;

	public StackImpl(int size) {

		this.stackSize = size;
		this.stackArr = new char[stackSize];
		this.top = -1;

	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public void push(char entry) {
		this.stackArr[++top] = entry;
	}

	public char pop() {
		char entry = this.stackArr[top--];
		return entry;
	}

}