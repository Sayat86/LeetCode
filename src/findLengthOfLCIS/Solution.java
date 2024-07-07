package findLengthOfLCIS;

public class Solution {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4, 7};
        System.out.println("Пример 1: " + findLengthOfLCIS(nums1));

        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println("Пример 2: " + findLengthOfLCIS(nums2));
    }
}
