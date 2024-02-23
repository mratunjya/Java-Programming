import java.util.Stack;

public class PushBottom {
    public static void pushBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int popped = s.pop();
        pushBottom(data, s);
        s.push(popped);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);

        pushBottom(4, s);

        System.out.println(s);
    }
}
