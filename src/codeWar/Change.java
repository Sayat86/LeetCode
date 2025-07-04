package codeWar;

import java.util.HashMap;
import java.util.Map;

public class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        if (cent <= 0) {
            return map;
        }

        int quarters = cent / 25;
        cent %= 25;

        int dimes = cent / 10;
        cent %= 10;

        int nickels = cent / 5;
        cent %= 5;

        int pennies = cent;

        map.put("Quarters", quarters);
        map.put("Dimes", dimes);
        map.put("Nickels", nickels);
        map.put("Pennies", pennies);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(looseChange(56));    // {Pennies=1, Nickels=1, Dimes=0, Quarters=2}
        System.out.println(looseChange(-435));  // {Pennies=0, Nickels=0, Dimes=0, Quarters=0}
        System.out.println(looseChange((int) Math.floor(4.935))); // {Pennies=4, Nickels=0, Dimes=0, Quarters=0}
    }
}
