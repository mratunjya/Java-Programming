public class Stack {
    private int top = -1;
    private int size = 3;
    private int arr[] = new int[size];

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }

        arr[++top] = data;
        System.out.println("Inserted");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[top]);
        --top;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
