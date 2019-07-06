//Get Minimum element from stack in constant O(1) time complexity
public class MinimumElement {
	
	public static void main(String[] args) {
		// one way is to sort the stack and find the lowest.
		// one way is through linked list .
		// other way is to maintain a supporting stack with the top element the lowest
		DemoStack1 stack = new DemoStack1();
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(15);
		stack.pop();
		
		stack.push(19);
		stack.push(22);
		stack.pop();
		
		stack.push(10);
		stack.push(12);
		stack.pop();
		
		
		stack.display();
		if(stack.top1 == -1){
			System.out.println("Stack is empty");
		}
		else
		System.out.println("output = "+stack.arr1[stack.top1]);
		
		
	}
	
}

class DemoStack1
{
	int MAXLEN = 9;
	
	int arr[] = new int[MAXLEN];
	int arr1[] = new int[MAXLEN];
	int top = -1;
	int top1 = -1;

	public void push(int i) {
		if(top == MAXLEN-1)
			System.out.println("Overflow");
		else{
			top+=1;
			arr[top] = i;
			
			if(top1 == -1){
				top1 = 0;
				arr1[top1] = i;
			}
			else if(i <= arr1[top1]){		// <=
				arr1[top1+1] = i;
				top1+=1;
			}
		}
	}

	public void pop() {
		if(top == -1){
			System.out.println("Underflow");
		}
		else{
		System.out.println("popped from stack = "+arr[top]);
		
		if(arr[top] == arr1[top1]){
			top1--;
			System.out.println("popped from supportive stack");
		}
		
		top--;
	}
	}

	public void display() {
		//stack
		System.out.println("Stack : ");
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+"\t");
		
		System.out.println();
		// supportive stack
		System.out.println("Supportive Stack : ");
		for(int j=0;j<=top1;j++)
			System.out.print(arr1[j]+"\t");
		
		System.out.println();
	}
	
	
	

	
}