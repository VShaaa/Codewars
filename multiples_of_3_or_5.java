import static java.util.stream.IntStream.range;
public class Solution {

  public int solution(int number) {
    //TODO: Code stuff here
    return range(3, number).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
  }
}