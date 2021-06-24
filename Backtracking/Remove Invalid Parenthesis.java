import java.io.*;
import java.util.*;

public class Main {

  public static void solution(String str, int minRemovalRequired, HashSet<String> ans) {

    if (minRemovalRequired == 0) {
      int mrn = getMin(str);
      if (mrn == 0) {
        if (!ans.contains(str)) {
          System.out.println(str);
          ans.add(str);
        }
      }
      return;

    }


    for (int i = 0; i < str.length(); i++) {
      String left = str.substring(0, i);
      String right = str.substring(i + 1);
      solution(left + right, minRemovalRequired - 1, ans);


    }
  }

  public static int getMin(String str) {

    Stack<Character> stk = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ')') {
        if (stk.size() == 0 || stk.peek() == ')') {
          stk.push(ch);
        } else {
          stk.pop();
        }

      } else {
        stk.push(ch);
      }
    }
    return stk.size();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    int mr = getMin(str);
    solution(str, mr, new HashSet<>());
  }

}
