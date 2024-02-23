import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "";

        s.push('h');
        s.push('e');
        s.push('l');
        s.push('l');
        s.push('o');

        while(!s.isEmpty()) {
            str = str + s.pop();
        }

        System.out.println(str);
    }
}
