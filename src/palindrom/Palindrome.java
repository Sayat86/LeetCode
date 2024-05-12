package palindrom;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 10 == 0 && x != 0) {
            return false;
        }
        int revers = 0;
        int copyOfX = x;
        while (copyOfX != 0) {
            revers = revers * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
            System.out.println(revers + ":" + copyOfX);
        }
        return revers == x;
    }
}
