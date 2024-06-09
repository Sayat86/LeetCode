package one;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

            int[] newArray = new int[n + 1];
            newArray[0] = 1;
            return newArray;
        }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(solution.plusOne(digits1))); // [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution.plusOne(digits2))); // [4, 3, 2, 2]

        int[] digits3 = {9, 9, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits3))); // [1, 0, 0, 0]

    }
}
