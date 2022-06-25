package OopsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String str="";
	  System.out.println("Enter test cases");
	  int t = sc.nextInt();
	   while(t-- != 0) {
		   System.out.println("enter the string");
		    str = sc.nextLine();
		    sc.nextLine();
	   }
		System.out.println(isBalanced(str)); 
	}
	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		  for (int i = 0; i < str.length(); i++) {
        
			 if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				 stack.push(str.charAt(i));
			 }
		  else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				 if(stack.isEmpty()) {
					 return false;
				 }
			else if(str.charAt(i) == '}') {
				 if(stack.peek() == '{') {
					 stack.pop();
				 }
				 else {
					 return false;
					 }
				 }
			else if(str.charAt(i) == ']') {
					 if(stack.peek() == '[') {
						 stack.pop();
					 }
					 else {
						 return false;
					 }
				 }
			 else if(str.charAt(i) == ')') {
					 if(stack.peek() == '(') {
				    	 stack.pop();
						 }
					 else {
				    	 return false;
						 }
				  }
				 else {
					 //do nothing
				 }
			 }
		}
		 if(stack.isEmpty()) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}

}
