package treningggggggggggggggg;

import leet20.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Stack;

public class L20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid("()"));        // true
        System.out.println(validParentheses.isValid("()[]{}"));    // true
        System.out.println(validParentheses.isValid("(]"));        // false
        System.out.println(validParentheses.isValid("([])"));      // true
        System.out.println(validParentheses.isValid(")("));      // false
    }
}
