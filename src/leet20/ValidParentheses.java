package leet20;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Если символ — открывающая скобка, добавляем в стек
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Если символ — закрывающая скобка

                // Если стек пуст, значит нет соответствующей открывающей скобки
                if (stack.isEmpty()) return false;

                // Извлекаем верхний символ из стека
                char top = stack.pop();

                // Проверяем, соответствует ли открывающая скобка закрывающей
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    // Если не соответствует — скобки расставлены неправильно
                    return false;
                }
            }
        }

        // Если после обработки всех символов стек пуст, то все скобки закрыты правильно
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
