import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "({})[]{}";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char chr : str.toCharArray()) {
            if (chr == '(' || chr == '[' || chr == '{') {
                stack.push(chr);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = stack.pop();
                if ((chr == ')' && top != '(') || (chr == ']' && top != '[') || (chr == '}' && top != '{')) {
                    isValid = false;
                    break;
                }
            }
        }

        isValid = isValid && stack.isEmpty();

        System.out.println(isValid);
    }
}
