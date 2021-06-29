import java.util.*;

public class Main {


  public static boolean isPossible(String name, String typed) {
    if (name.length() > typed.length())return false;
    int i = 0;
    int j = 0;
    while (i < name.length() && j < typed.length()) {
      char namech = name.charAt(i);
      char typedch = typed.charAt(j);
      if (i == 0) {
        if (namech != typedch) {
          return false;
        } else {
          i++;
          j++;
        }
      }
      else {
        if (namech == typedch) {
          i++;
          j++;
        } else if (name.charAt(i - 1) == typedch) {
          j++;
        } else {
          return false;
        }
      }
    }
    if (i < name.length())return false;
    while (j < typed.length()) {
      if (typed.charAt(j) != name.charAt(name.length() - 1)) {
        return false;
      }
      j++;
    }

    return true;

  }

  // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String name = scn.next();
    String typed = scn.next();

    boolean res = isPossible(name, typed);

    System.out.println(res);
  }
}
