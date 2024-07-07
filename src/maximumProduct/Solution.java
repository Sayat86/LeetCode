package maximumProduct;

import java.util.Arrays;

public class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = (nums[n-1] * nums[n-2] * nums[n-3]);

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.println("Пример 1: " + maximumProduct(nums1));

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Пример 2: " + maximumProduct(nums2));

        int[] nums3 = {-1, -2, -3};
        System.out.println("Пример 3: " + maximumProduct(nums3));
    }
}
