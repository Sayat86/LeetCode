package thirdMax;

import java.util.TreeSet;

public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> maxSet = new TreeSet<>();

        for (int num : nums) {
            maxSet.add(num);
            if (maxSet.size() > 3) {
                maxSet.pollFirst();
            }
        }
        if (maxSet.size() < 3) {
            return maxSet.last();
        } else {
            return maxSet.first();
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 1};
        System.out.println(solution.thirdMax(nums1));

        int[] nums2 = {1, 2};
        System.out.println(solution.thirdMax(nums2));

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(solution.thirdMax(nums3));
    }
}
