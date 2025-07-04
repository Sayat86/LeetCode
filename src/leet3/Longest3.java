package leet3;

import java.util.HashSet;
import java.util.Set;

public class Longest3 {
    public static class Result {
        int length;
        String substring;

        public Result(int length, String substring) {
            this.length = length;
            this.substring = substring;
        }

        @Override
        public String toString() {
            return "Length: " + length + ", Substring: \"" + substring + "\"";
        }
    }

    public Result findLongestUniqueSubstring(String s) {
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

        return new Result(maxLen, s.substring(start, start + maxLen));
    }

    public static void main(String[] args) {
        Longest3 ls = new Longest3();
        System.out.println(ls.findLongestUniqueSubstring("abcabcbb")); // Length: 3, Substring: "abc"
        System.out.println(ls.findLongestUniqueSubstring("bbbbb"));    // Length: 1, Substring: "b"
        System.out.println(ls.findLongestUniqueSubstring("pwwkew"));   // Length: 3, Substring: "wke"
    }
}
