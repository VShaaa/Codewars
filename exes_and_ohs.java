import java.util.*;
public class XO {
  
  public static boolean getXO (String str) {
    
        int countX = 0;
        int countO = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c == 'x') {
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(getXO(str));
    }
}