import java.util.*;  
class stack  
{  
	public static void main(String[] args)   
	{  
		Stack  stk= new Stack();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  

		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		System.out.println("Elements in Stack: " + stk);  

		stk.pop();
		stk.pop();
		System.out.println("Elements in Stack: " + stk);  

		stk.push("Hello");
		System.out.println("Elements in Stack: " + stk);  

		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
	}  
}

