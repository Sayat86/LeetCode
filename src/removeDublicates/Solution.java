package removeDublicates;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));

    }
    public int removeDuplicates(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                continue;
            }
            k++;
            last = nums[i];
        }
        return k;
    }
}
