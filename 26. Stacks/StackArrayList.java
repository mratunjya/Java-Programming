import java.util.ArrayList;

public class StackArrayList {
    ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int data) {
        stack.add(data);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }

        stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1; // or any other appropriate value to indicate an empty stack
        }

        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) {
        StackArrayList s = new StackArrayList();

        s.push(1);
        System.out.println(s.peek());
        s.push(2);
        System.out.println(s.peek());
        s.push(3);
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
