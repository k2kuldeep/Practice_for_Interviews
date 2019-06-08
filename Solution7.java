/*Problem Statement: Perform sorting operation on a stack
Follow-up Question 1: You can only use 1 additional stack for solving the problem.
This problem is quite popular among stack problems asked by companies.
 */
import java.util.Stack;
public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(20);
		stack.push(12);
		stack.push(15);
		stack.push(25);
		stack.push(1);
		stack.push(7);
		stack.push(9);
		
		System.out.println("before : "+stack);
		
		//taking each element out of stack into "temp" variable one by one and putting into temporary stack 
		//until an element is found which is smaller than the top value of temporary stack.
		//if top(temporary stack) < temp(which was the top value of stack), then temporary stack values are popped
		//and stored to stack until the element is found which is less than temp value.
		//when the element which is less than temp value is found, then temp value is stored above it.
		
		/*Stack<Integer> tmpstack = new Stack<>();
		while(!stack.isEmpty()){
			int temp = stack.pop();
			
			while(!tmpstack.isEmpty() && tmpstack.peek() > temp)
				stack.push(tmpstack.pop());
			
			tmpstack.push(temp);
			
		}
		
		System.out.println("after = "+tmpstack);
		*/
		
		sortstack(stack);
		System.out.println("after = "+stack);
	}
	
	//pop out elements from stack into temp variable until stack is empty
	//then pass it in backward to sortinsert function
	//it will put the variable at its right position in the stack
	
	public static void sortstack(Stack<Integer> s){
		if(!s.isEmpty()){
			int temp = s.pop();
			sortstack(s);
			sortInsert(s,temp);
		}	
	}
	
	public static void sortInsert(Stack<Integer> stack,int temp){
		//if top(stack) < temp then push temp and return
		if(stack.isEmpty() || stack.peek()<temp)		// top(stack)<temp for ascending
		{
			stack.push(temp);
			return;
		}
		
		// if top of stack is > temp
		// pop top until less than temp value is found and then push it .
		int top = stack.pop();
		sortInsert(stack, temp);
		
		stack.push(top);	
	}

}
