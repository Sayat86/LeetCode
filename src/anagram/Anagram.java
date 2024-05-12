package anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        char[] leftChar = left.toCharArray();
        Arrays.sort(leftChar);
        char[] rightChar = right.toCharArray();
        Arrays.sort(rightChar);
        return Arrays.equals(leftChar, rightChar);
    }
}
