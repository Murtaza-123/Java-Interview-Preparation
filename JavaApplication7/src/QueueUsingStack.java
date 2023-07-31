
import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        Queue myqueue = new Queue();
        myqueue.enqueueQueue(1);
        myqueue.enqueueQueue(2);
        myqueue.enqueueQueue(3);
        System.out.println(myqueue.dequeueQueue());
        System.out.println(myqueue.dequeueQueue());
        System.out.println(myqueue.dequeueQueue());

    }
}

class Queue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueueQueue(int val) {
        while (!s1.isEmpty()) {
            s2.add(s1.pop());
        }
        s1.add(val);
        while (!s2.isEmpty()) {
            s1.add(s2.pop());
        }
    }

    public int dequeueQueue() {
        if (s1.isEmpty()) {
            System.exit(0);
        }
        return s1.pop();

    }

}
