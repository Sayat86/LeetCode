package codeWar;

public class RemoveChars {
    public String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        RemoveChars removeChars = new RemoveChars();
        System.out.println(removeChars.remove("eloquent"));
        System.out.println(removeChars.remove("country"));
        System.out.println(removeChars.remove("person"));
        System.out.println(removeChars.remove("ab"));
        System.out.println(removeChars.remove("xyz"));
    }
}
