package javaquestions;

import java.util.Stack;

public class BalancedBracket {

	static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
				stack.push(input.charAt(i));
			}
			if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
				if (stack.empty()) {
					return false;
				}
				char top_char = (char) stack.pop();
				if ((top_char == '{' && input.charAt(i) != '}') || (top_char == '(' && input.charAt(i) != ')')
						|| (top_char == '[' && input.charAt(i) != ']')) {
					return false;
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {

		String input = "{([])";

		if (isBalanced(input)) {
			System.out.println("The input string is balanced..");
		} else {
			System.out.println("Input String is not balanced...");
		}

	}

}
