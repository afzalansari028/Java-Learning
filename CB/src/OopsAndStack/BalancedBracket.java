package OopsAndStack;
import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
	String str = "({[])}";
	System.out.println(isBalanced(str));

	}
	
	public static boolean isBalanced(String str) {
		
		Stack<Character> stack = new Stack<>();
		boolean IsBalanced = true;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));	
			}
			if(stack.isEmpty()) {
				IsBalanced = false;
				break;
			}
			
			if(str.charAt(i) == ')') {
				if(stack.peek() == '(') {
					stack.pop();
				}
				else {
					IsBalanced = false;
					break;
				}
			}
			
			if(str.charAt(i) == '}') {
				if(stack.peek() == '{') {
					stack.pop();
				}
				else {
					IsBalanced = false;
					break;
				}
			}
			
			if(str.charAt(i) == ']') {
				if(stack.peek() == '[') {
					stack.pop();
				}
				else {
					IsBalanced = false;
					break;
				}
			}
		}
		if(!stack.isEmpty()) {
			IsBalanced = false;
		}
		
		if(IsBalanced) {
			return true;
		}
		else {
		return false;
		}
	}

}
