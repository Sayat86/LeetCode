package sort;

import containsDublicate.Solution;

import java.lang.reflect.Array;
import java.util.*;

public class SortBall {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        SortBall sortBall = new SortBall();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(sortBall.containsDuplicate(nums1)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sortBall.containsDuplicate(nums2)); // false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(sortBall.containsDuplicate(nums3)); // true
    }
}
