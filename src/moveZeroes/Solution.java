package moveZeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[last++] = nums[i];
            }
        }
        for (int i = last; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
