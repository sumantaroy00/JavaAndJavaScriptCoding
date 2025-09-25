package CustomJavaCollectionImplementation.StackQueue;

import java.util.*;

class myQueue{


    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Enqueue: O(1)
    public void enqueue(int x) {
        input.push(x);
    }

    // Dequeue: Amortized O(1)
    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return output.pop();
    }

    // Peek: O(1) Amortized
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return output.peek();
    }

    // Check if empty
    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }



}





public class ImplementQueueUsingStack {


    public static void main(String[] args) {

    myQueue queue = new myQueue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println(queue.dequeue()); // 10
    System.out.println(queue.peek());    // 20
    System.out.println(queue.isEmpty()); // false

        
    }




    
}
