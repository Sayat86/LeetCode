package singleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNumber = 0;
        for (int num : nums) {
            uniqueNumber ^= num;  // Применяем операцию XOR для каждого элемента массива
        }
        return uniqueNumber;  // Возвращаем единственный элемент
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 2, 1};
        System.out.println(solution.singleNumber(nums1));  // Вывод: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums2));  // Вывод: 4

        int[] nums3 = {1};
        System.out.println(solution.singleNumber(nums3));  // Вывод: 1
    }
}
