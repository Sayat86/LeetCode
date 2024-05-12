package anagram;

public class App {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("arfa", "fara"));
        System.out.println(anagram.isAnagram("veter", "terev"));
        System.out.println(anagram.isAnagram("veten", "terev"));
    }
}
