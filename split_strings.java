public class StringSplit {
    public static String[] solution(String s) {
        if (s.isEmpty()) return new String[0];
        s = (s.length() % 2 != 0) ? s + "_" : s;
        return s.split("(?<=\\G.{2})");
    }
}