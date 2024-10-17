public class Kata {
  public static int solution(int speed, int time) {
    int x = Math.min(speed / 3 + 1, (time + 1) / 2);
    return (time + x) * speed - x * (x - 1) * 3 / 2;
  }
}