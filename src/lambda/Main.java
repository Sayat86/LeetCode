package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordUp wordUp = (s1) -> {
            List<String> max = new ArrayList<>();
            for (int i = 0; i < s1.size(); i++) {
                if (s1.get(i).length() > 7) {
                    max.add(s1.get(i));
                }
            }
            return max.toString();
        };

        List<String> s = new ArrayList<>();
        s.add("word");
        s.add("words");
        s.add("template");
        s.add("templates");
        System.out.println(wordUp.countWords(s));
    }
    public interface WordUp {
        String countWords(List<String> s1);
    }
}
