package codeWar;

public class AgeDifference {
    public static int yearsUntilDoubleAge(int older, int younger) {
        return Math.abs(older - younger * 2);
    }

    public static void main(String[] args) {
        System.out.println(yearsUntilDoubleAge(40, 20)); // 0
        System.out.println(yearsUntilDoubleAge(30, 10)); // 10
        System.out.println(yearsUntilDoubleAge(45, 30)); // 15
        System.out.println(yearsUntilDoubleAge(29, 0));  // 29
    }
}
