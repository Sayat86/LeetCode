package palindrom;

public class StrPalindrome {
    public static void main(String[] args) {
        String text = "лидер бредил";
        System.out.println(isPalindrome(text));
        System.out.println(isPalindrome("Уж редко рукою окурок держу"));
        System.out.println(isPalindrome("А роза упала на лапу азора"));
        System.out.println(isPalindrome("Не стоит падать назад"));
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toUpperCase();
        char[] chars = text.toCharArray();
        System.out.println(chars);
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
