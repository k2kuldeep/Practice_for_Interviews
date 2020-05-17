/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
Output
[null,null,null,null,-3,null,0,-2]
Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
Constraints:
Methods pop, top and getMin operations will always be called on non-empty stacks.*/

public class minStack {
    public static void main(String[] args) {

        DemoStack obj  = new DemoStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());

    }
}

class DemoStack {

    int arr[] = new int[10000];
    int min = Integer.MAX_VALUE;
    int top = -1;


    void push(int x){
        if (top >= -1){
            top++;
            arr[top] = x;
        }

        if (min > x)
            min = x;
    }

    void pop(){
        if (arr[top] != min){
            top--;
        }
        else{
            min = Integer.MAX_VALUE;
            for (int i=0;i<top;i++){
                if (min > arr[i])
                    min = arr[i];
            }
            top--;
        }

    }

    int top(){
        return arr[top];
    }

    int getMin(){
        return min;
    }

}
