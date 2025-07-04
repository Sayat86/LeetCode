package codeWar;

import java.util.Arrays;

public class CatAndDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYear = 0;
        int dogYear = 0;
        if (humanYears == 1) {
            catYear = 15;
            dogYear = 15;
        } else if (humanYears == 2) {
            catYear = 15 + 9;
            dogYear = 15 + 9;
        } else {
            catYear = (humanYears - 2) * 4 + 24;
            dogYear = (humanYears - 2) * 5 + 24;
        }
        return new int[]{humanYears, catYear, dogYear};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }
}
