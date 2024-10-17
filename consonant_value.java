import static java.util.stream.Stream.of;
public class ConsonantValue {
    public static int solve(final String s) {
      return of(s.split("[aeiou]")).mapToInt(c -> c.chars().map(ch -> ch - 96).sum()).max().orElse(0);
    }
}