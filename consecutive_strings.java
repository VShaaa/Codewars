import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        // your code
      var max = "";
      for (var i = 0; k > 0 && i <= strarr.length - k; i++) {
        var s = stream(strarr, i, i + k).collect(joining());
        if (s.length() > max.length()) {
          max = s;
        }
      }
      return max;
    }
}