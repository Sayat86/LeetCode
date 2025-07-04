package codeWar;

public class FindShort {
    public int shortF(String s) {
        String[] worlds = s.split(" ");
        int minLength = worlds[0].length();

        for (String word : worlds) {
            if (minLength > word.length()) {
                minLength = word.length();
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        FindShort findShort = new FindShort();
        System.out.println(findShort.shortF("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort.shortF("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort.shortF("Let's travel abroad shall we"));
    }
}
