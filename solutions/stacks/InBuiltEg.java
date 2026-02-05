import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//stack-class queue-interface
public class InBuiltEg {
    public static void main(String[] args) {
        // Stack<Integer> stack=new Stack<>();
        // stack.push(34);
        // stack.push(45);
        // stack.push(67);
        // System.out.println(stack.pop());

        // Queue<Integer> queue=new LinkedList<>();
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.peek());
        // Arraydeque resizable array
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(34);
        deque.addFirst(45);
        deque.remove();

    }
}
