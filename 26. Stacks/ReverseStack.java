import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> s) {
        for(int i = 0; i < s.size() / 2; i++) {
            int start = s.get(i);
            int end = s.get(s.size() - i - 1);

            s.set(i, end);
            s.set(s.size() - i - 1, start);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        System.out.println(s);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);

        reverse(s);

        System.out.println(s);
    }
}
