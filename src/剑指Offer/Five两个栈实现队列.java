package ��ָOffer;

import java.util.Stack;

public class Five����ջʵ�ֶ��� {
	 Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	       stack1.push(node);
	    }
	    
	    public int pop() {
	    	if(!stack2.isEmpty())
	    		return stack2.pop();
	    	while(!stack1.isEmpty())
	    			stack2.push(stack1.pop());
	    	if(stack2.isEmpty())
	    	 throw new RuntimeException("Queue is empty!");;
	    	return stack2.pop();
	    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
