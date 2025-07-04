package codeWar;

public class TrafficLights {
    public static String updateLight(String current) {
        if (current.equals("red")) {
            return current + " -> green";
        } else if (current.equals("green")) {
            return current + " -> yellow";
        } else if (current.equals("yellow")) {
            return current + " -> red";
        } else {
            return "unknown state";
        }

//        Map<String, String> transitions = new HashMap<>();
//        transitions.put("red", "green");
//        transitions.put("green", "yellow");
//        transitions.put("yellow", "red");
//
//        String next = transitions.get(current); // ищем следующий цвет
//
//        if (next != null) {
//            return current + " -> " + next;
//        } else {
//            return "unknown state"; // если current — не "red", "green" или "yellow"
//        }
    }

    public static void main(String[] args) {
        System.out.println(updateLight("red"));
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
    }
}
