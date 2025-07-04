package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        SquareNumber squareNumber = (s1) -> {
            List<Integer> max = new ArrayList<>();
            for (int i = 0; i < s1.size(); i++) {
                    max.add(s1.get(i) * s1.get(i));
            }
            return max;
        };

        List<Integer> sq = new ArrayList<>();
        sq.add(1);
        sq.add(3);
        sq.add(5);
        sq.add(7);
        System.out.println(squareNumber.SqNum(sq));
    }
    public interface SquareNumber {
        List<Integer> SqNum(List<Integer> s1);
    }
}
