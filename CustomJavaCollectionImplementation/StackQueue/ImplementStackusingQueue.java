package CustomJavaCollectionImplementation.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack{

    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        // Rotate the queue to move the newly added element to the front
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll(); // Front is the top of stack
    }

    public int top() {
        return queue.peek(); // Peek the front
    }

    public boolean empty() {
        return queue.isEmpty();
    }



}

public class ImplementStackusingQueue {

    public static void main(String[] args) {
        
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());   // 30
        System.out.println(stack.pop());   // 30
        System.out.println(stack.top());   // 20
        System.out.println(stack.empty()); // false
    }
    
}
