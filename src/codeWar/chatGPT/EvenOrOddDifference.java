package codeWar.chatGPT;

public class EvenOrOddDifference {
    public static String evenOrOddDifference(int a, int b) {
        int diff = Math.abs(a - b);
        if (diff % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

        //return (diff % 2 == 0) ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOddDifference(10, 4));
        System.out.println(evenOrOddDifference(7, 2));
        System.out.println(evenOrOddDifference(8, 8));
    }
}
