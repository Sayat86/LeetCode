package twoSum;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] nums = new int[]{1, 2, 3, 5};
        int target = 9;
        int[] res = sum.twoSum(nums, target);
        if (res == null) {
            System.out.println("Решение не найдено");
        }
        else {
        System.out.println(nums[res[0]] + " + " + nums[res[1]] + " = " + target);
        }
    }
}
