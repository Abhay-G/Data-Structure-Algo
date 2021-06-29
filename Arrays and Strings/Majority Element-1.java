import java.util.*;

public class Main {

  public static void printMajorityElement(int[] arr) {
    int val = arr[0];
    int count = 1;
    for (int i = 1; i < arr.length; i++) {
      if (count == 0) {
        val = arr[i];
        count++;

      } else {
        if (arr[i] == val) {
          count++;
        } else {
          count--;
        }
      }
    }
    if (count == 0) {
      System.out.println("No Majority Element exist");
      return;
    }
    count = 0;
    for (int k : arr) {
      if (k == val) {
        count++;
      }
    }
    if (count > arr.length / 2) {
      System.out.println(val);
    } else {
      System.out.println("No Majority Element exist");
    }
  }

  // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    printMajorityElement(arr);
  }
}
