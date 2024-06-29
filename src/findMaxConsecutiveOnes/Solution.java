package findMaxConsecutiveOnes;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != last) {
                count = 0;
            }
            count++;
            if (max < count) {
                max = count;
            }
            last = nums[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 1, 0, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1, 1, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}
