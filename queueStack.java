package dailyByte;
import java.util.LinkedList;
import java.util.Queue;
/*Design a class to implement a stack using only a single queue. Your class,
QueueStack, should support the following stack methods: push() (adding an item),
pop() (removing an item), peek() (returning the top value without removing it),
and empty() (whether or not the stack is empty).*/
public class queueStack {
    public static void main(String[] args) {
        DemoQueueStack queueStack = new DemoQueueStack();
        queueStack.push(1);
        queueStack.push(2);
        System.out.println(queueStack.peek());
        System.out.println(queueStack.pop());
        System.out.println(queueStack.Empty());
    }
}
class DemoQueueStack{
    private Queue<Integer> queue;
    DemoQueueStack(){
        queue = new LinkedList<>();
    }
    // at the time of pushing element,count the size of queue and pop that many element from queue
    // and push them in queue again to maintain stack property.
    public void push(int num){
        int len = queue.size();
        queue.add(num);
        while (len-->0){
            queue.add(queue.poll());
        }
    }

    public int pop(){
        if (queue.isEmpty())
            return -1;
        else
            return queue.poll();
    }

    public int peek(){
        if (queue.isEmpty())
            return -1;
        else
           return queue.peek();
    }

    public boolean Empty(){
        return queue.isEmpty();
    }


}