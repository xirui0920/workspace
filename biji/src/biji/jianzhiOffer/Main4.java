package biji.jianzhiOffer;
import java.util.Stack;
/*
 * 用两个栈实现队列
 */
public class Main4 {

	
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	    	int size=stack1.size();
	    	int temp=0;
			for (int i = 0; i < size; i++) {				
				temp = stack1.pop();
				stack2.push(temp);
			}
			stack2.pop();
			for (int i = 0; i < stack2.size(); i++) {
				stack1.push(stack2.pop());
			}
			return temp;
	    }
	
}
