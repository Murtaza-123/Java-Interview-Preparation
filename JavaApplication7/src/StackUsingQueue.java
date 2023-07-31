
import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.print();
        // System.out.println(stack.pop());
        // System.out.println(stack.top);
    }
}

class Stack {

    int top;
    Queue<Integer> q1;
    Queue<Integer> q2;

    Stack() {
        top = 0;
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void insert(int val) {
        q1.add(val);
        top = val;
    }

    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int k = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return k;
    }

    public int top() {
        return top;
    }

    public void print() {

        System.out.print(q1);

    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
