package lengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "hello world";
        System.out.println(solution.lengthOfLastWorld(str));
        System.out.println(solution.lengthOfLastWorld("helicopter is flying above the ground"));
    }
    public int lengthOfLastWorld(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}
