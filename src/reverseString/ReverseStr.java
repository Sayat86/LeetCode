package reverseString;

import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {
        ReverseStr reverseStr = new ReverseStr();
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseStr.reverseString(s);
        System.out.println(Arrays.toString(s));

    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (right > left) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
