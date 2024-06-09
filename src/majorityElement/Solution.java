package majorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            System.out.println("candidate - " + candidate);
        }

        return candidate;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1));  // Вывод: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2));  // Вывод: 2
    }
}
