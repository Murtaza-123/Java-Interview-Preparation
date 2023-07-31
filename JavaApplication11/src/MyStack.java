
public class MyStack {

    public static void main(String[] args) throws StackOverFlowException {
        Stack stack = new Stack(10);
        //stack.insert(1);
        //stack.insert(2);
       // stack.insert(3);
        System.out.println(stack.pop());
        stack.printStack();

    }
}

class Stack {

    private int top;
    private int[] array;
    int size;

    Stack(int size) {
        int top = -1;
        this.size = size;
        array = new int[this.size];
    }

    public void insert(int n) throws StackOverFlowException {
        if (this.top > size - 1) {
            throw new StackOverFlowException();
        }
        this.top++;
        this.array[top] = n;

    }

    public void printStack() {
        for (int i = top; i > 0; i--) {
            System.out.println(this.array[i]);
        }
    }

    public int pop() throws StackOverFlowException {
        if (this.top <= 0) {
            throw new StackOverFlowException();
        }
        return this.array[this.top];

    }

    public int peek() throws StackOverFlowException {

        if (this.top <= 0) {
            throw new StackOverFlowException();

        }
        return array[top];
    }

}
