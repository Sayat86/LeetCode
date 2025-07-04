package codeWar;


public class Kata {
    public Double findUniq(double[] arr) {
        double candidate;
        if (arr[0] == arr[1]) {
            candidate = arr[0];
        } else if (arr[0] == arr[2]) {
            candidate = arr[0];
        } else {
            return arr[0];
        }

        for (double num : arr) {
            if (num != candidate) {
                return num;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
        System.out.println(kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }));
    }
}
