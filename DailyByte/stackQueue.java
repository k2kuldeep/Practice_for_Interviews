package dailyByte;
import java.util.Stack;
/*Implement the following operations of a queue using stacks.
    push(x) -- Push element x to the back of queue.
    pop() -- Removes the element from in front of queue.
    peek() -- Get the front element.
    empty() -- Return whether the queue is empty.
Example:
MyQueue queue = new MyQueue();
queue.push(1);
queue.push(2);
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false
Notes:
    You must use only standard operations of a stack -- which means only push to top,
    peek/pop from top, size, and is empty operations are valid.
    Depending on your language, stack may not be supported natively. You may simulate a
    stack by using a list or deque (double-ended queue), as long as you use only standard
    operations of a stack.
    You may assume that all operations are valid (for example, no pop or peek operations
    will be called on an empty queue).
*/
public class stackQueue {
    public static void main(String[] args) {

    }
}
class DemoStackQueue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public DemoStackQueue(){
    }
    public void push(int x){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }
    public int pop(){
        if (stack1.isEmpty())
            return -1;
        else
            return stack1.pop();
    }
    public int peek(){
        if (stack1.isEmpty())
            return -1;
        else
            return stack1.peek();
    }
    public boolean empty(){
        return stack1.isEmpty();
    }
}