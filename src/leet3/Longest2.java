package leet3;

import java.util.HashSet;
import java.util.Set;

public class Longest2 {
    public String longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        Longest2 ls = new Longest2();
        System.out.println(ls.longestUniqueSubstring("abcabcbb")); // abc
        System.out.println(ls.longestUniqueSubstring("bbbbb"));    // b
        System.out.println(ls.longestUniqueSubstring("pwwkew"));   // wke
    }
}
