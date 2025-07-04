package codeWar;

public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - sonYears * 2);
    }

    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 0));
        System.out.println(twiceAsOld(30, 7));
        System.out.println(twiceAsOld(45, 30));
        System.out.println(twiceAsOld(36, 7));
        System.out.println(twiceAsOld(55, 30));
        System.out.println(twiceAsOld(42, 21));
        System.out.println(twiceAsOld(22, 1));
        System.out.println(twiceAsOld(29, 0));
    }
}
