import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int j = 0; j < arr[0].length; j++){
            if(arr[0][j] <= min){
                smin = min;
                min = arr[0][j];
            } else if(arr[0][j] <= smin){
                smin = arr[0][j];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int cmin = Integer.MAX_VALUE;
            int csmin = Integer.MAX_VALUE;

            for(int j = 0; j < arr[i].length; j++){
                if(arr[i - 1][j] != min){
                    arr[i][j] += min;
                } else {
                    arr[i][j] += smin;
                }

                if(arr[i][j] <= cmin){
                    csmin = cmin;
                    cmin = arr[i][j];
                } else if(arr[i][j] <= csmin){
                    csmin = arr[i][j];
                }
            }

            min = cmin;
            smin = csmin;
        }

        System.out.println(min);
    }
}
