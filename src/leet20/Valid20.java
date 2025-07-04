package leet20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Valid20 {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (brackets.containsValue(ch)) {
                // Открывающая скобка
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {
                // Закрывающая скобка
                if (stack.isEmpty() || stack.pop() != brackets.get(ch)) {
                    return false;
                }
            } else {
                // Неизвестный символ — можно выбросить исключение или игнорировать
                return false;
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
