package prefix;

public class PrefixMain {
    public static void main(String[] args) {
        PrefixMain prefixMain = new PrefixMain();

        String[] strings = new String[]{"flower", "flow", "fly"};
        String[] strings1 = new String[]{"group", "flow", "fly"};


        System.out.println(prefixMain.pref(strings));
        System.out.println(prefixMain.pref(strings1));
    }

    public String pref (String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String result = str[0];

        for (int i = 0; i < str.length; i++) {
            while (str[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}
