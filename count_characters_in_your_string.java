import java.util.Map;
import static java.util.stream.Collectors.toMap;
public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
      return str.chars().mapToObj(c -> (char) c).collect(toMap(c -> c, c -> 1, Integer::sum));
  }
}