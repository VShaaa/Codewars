import static java.util.stream.Stream.of;
public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
    return of(array1).filter(a -> of(array2).anyMatch(b -> b.contains(a))).sorted().toArray(String[]::new);
  }
}