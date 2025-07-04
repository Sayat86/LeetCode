package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        NegativeNumber negativeNumber = (s1) -> {
            List<Integer> max = new ArrayList<>();
            for (int i = 0; i < s1.size(); i++) {
                if (s1.get(i) < 0) {
                    max.add(s1.get(i));
                }
            }
            return max;
        };

        List<Integer> neg = new ArrayList<>();
        neg.add(1);
        neg.add(3);
        neg.add(-5);
        neg.add(-7);
        System.out.println(negativeNumber.NegNum(neg));
    }
    public interface NegativeNumber {
        List<Integer> NegNum(List<Integer> s1);
    }
}
