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
		/*Stack<Integer> tmpstack = new Stack<>();
		
		while(!stack.isEmpty()){
			int temp = stack.pop();
			
			while(!tmpstack.isEmpty() && tmpstack.peek() > temp)
				stack.push(tmpstack.pop());
			
			tmpstack.push(temp);
			
		}
		
		System.out.println("after = "+tmpstack);*/
		
		
		
	}
	
	public static void sortstack(){
		
	}

}
