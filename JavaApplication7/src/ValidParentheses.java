
import java.util.Stack;
import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Valid val = new Valid();
        val.isValid("()");
    }
}

class Valid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (i == '(') {
                stack.add(')');
            } else if (i == '{') {
                stack.add('}');
            } else if (i == '[') {
                stack.add(']');
            } else if (stack.isEmpty() || stack.pop() != i) {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
