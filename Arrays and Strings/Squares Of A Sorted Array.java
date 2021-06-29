import java.util.*;

public class Main {
  public static int[] sortedSquares(int[] nums) {
      
    int res[] = new int[nums.length];
    int i = 0;
    int j = nums.length - 1;
    int idx = nums.length - 1;
    while (i <= j) {
      int eleI = nums[i] * nums[i];
      int eleJ = nums[j] * nums[j];
      if (eleI < eleJ) {
        res[idx] = eleJ;
        j--;
      } else {
        res[idx] = eleI;
        i++;
      }
      idx--;
    }
    return res;
  }



  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++)
      nums[i] = scn.nextInt();

    int[] res = sortedSquares(nums);

    for (int i = 0; i < n; i++) {
      System.out.print(res[i] + " ");
    }
  }
}
