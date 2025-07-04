package codeWar.chatGPT;

public class DigitsDifferent {
    public static boolean allDigitsDifferent(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(allDigitsDifferent(123));
        System.out.println(allDigitsDifferent(454));
        System.out.println(allDigitsDifferent(111));
    }
}
