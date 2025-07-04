package codeWar.chatGPT;

public class SmallerThanAverage {
    public static boolean isSmallerThanAverage(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        return a < average || b < average || c < average;
    }

    public static void main(String[] args) {
        System.out.println(isSmallerThanAverage(3, 5, 7));
        System.out.println(isSmallerThanAverage(4, 4, 4));
        System.out.println(isSmallerThanAverage(8, 9, 10));
    }
}
