
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
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

    public void push(int x) {
      q1.add(x);
      top = x;
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

    public boolean isEmpty() {
        return q1.isEmpty();
    }

}
