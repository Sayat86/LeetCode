package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        WordCount wordCount = (s) -> {
            List<Integer> c = new ArrayList<>();
            for (String word : s) {
                c.add(word.length());
            }
            return c.toString();
        };

        List<String> s1 = new ArrayList<>();
        s1.add("word");
        s1.add("words");
        s1.add("template");
        s1.add("templates");
        System.out.println(wordCount.countWords(s1));
    }
    public interface WordCount {
        String countWords(List<String> s);
    }
}
