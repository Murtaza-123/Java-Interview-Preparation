
class Test {

    public int top;
    public int[] array;
    public int size;

    Test(int size) {
        top = -1;
        this.size = size;
        this.array = new int[size];

    }

    public void push(int value) throws StackOverflowException {
        if (top == size - 1) {
            throw new StackOverflowException();
        } else {
            top++;
            this.array[top] = value;

        }

    }

    public int pop() throws StackOverflowException {
        if (top <= 0) {
            throw new StackOverflowException();
        }

        return array[top--];
    }

    public int peek() throws StackOverflowException {
        if (this.top <= 0) {
            throw new StackOverflowException();
        }

        return this.array[top];
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(this.array[i] + " ");
        }
        System.out.println();
    }
}

public class Stack {

    public static void main(String[] args) throws StackOverflowException  {
        Test test = new Test(3);
        test.push(1);
        test.push(2);
        test.push(3);
        test.peek();
        test.printStack();
        //test.pop();
        // System.out.println("Element Pop: "+test.pop());
        //test.printStack();

        // System.out.println("peek:"+test.peek());
    }
}
