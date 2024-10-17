import static java.util.stream.Stream.of;
import static java.util.stream.Collectors.joining;
public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    return of(sentence.split(" ")).map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word).collect(joining(" "));
  }
}