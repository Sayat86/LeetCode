package lambda;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        WordCount wordCount = (s) -> {
            List<String> upperCaseWords = new ArrayList<>();
            for (String word : s) {
                upperCaseWords.add(word.toUpperCase());
            }
            upperCaseWords.sort(Comparator.comparingInt(String::length));
            return upperCaseWords.toString();
        };

        List<String> s1 = new ArrayList<>();
        s1.add("template");
        s1.add("words");
        s1.add("road");
        s1.add("templates");
        System.out.println(wordCount.countWords(s1));
    }
    public interface WordCount {
        String countWords(List<String> s);
    }
}
