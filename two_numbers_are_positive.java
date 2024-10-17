public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    if (a>0 && b>0 && c>0)
      return false;
    else if((a>0 && b>0) || (b>0 && c >0) || (a>0 && c>0))
      return true;
    return false;
  }
}