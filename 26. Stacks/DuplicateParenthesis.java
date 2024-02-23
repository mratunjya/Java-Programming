import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String str = "((a + b) + (c + d))";
        Stack<Character> stack = new Stack<>();
        boolean containsDuplicate = false;

        for (char chr : str.toCharArray()) {
            if (chr != ')')
                stack.push(chr);
            else {
                int count = 0;

                while (stack.pop() != '(') {
                    ++count;
                }

                if (count == 0) {
                    containsDuplicate = true;
                    break;
                }
            }
        }

        System.out.println(containsDuplicate);
    }
}
