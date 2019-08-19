import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaxInConstantTime {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(8);
		stack.push(10);
		
		int z = Collections.max(stack);
		System.out.println(z);
		
		//----------------------------------------------------------
		int arr[]={1,2,3,4};
		int a= Arrays.stream(arr).max().getAsInt();
		System.out.println(a);
		
	}

}
