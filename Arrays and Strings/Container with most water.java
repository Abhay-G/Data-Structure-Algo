import java.util.*;

public class Main {
  public static int mostWater(int[] heights) {

    int i = 0;
    int j = heights.length - 1;
    int res = 0;
    while (i < j) {
      int b = j - i;
      int h = Math.min(heights[i], heights[j]);
      if (res < b * h) {
        res = b * h;
      }
      if (h == heights[i]) {
        i++;
      } else {
        j--;
      }
    }
    return res;

  }

  // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] heights = new int[n];
    for (int i = 0; i < n; i++) {
      heights[i] = scn.nextInt();
    }

    int res = mostWater(heights);
    System.out.println(res);
  }
}
