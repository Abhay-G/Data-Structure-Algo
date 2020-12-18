import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        int dp[][] = new int[k+1][n];
        for(int t=1;t<=k;t++)
        {
            for(int d=1;d<n;d++)
            {
               int max = dp[t][d-1];
                for(int pd = 0;pd<d;pd++)
                {
                    int ptilltm1 = dp[t-1][pd];
                    int tth = arr[d]-arr[pd];
                    if(tth+ptilltm1>max)
                    {
                        max = tth+ptilltm1;
                    }
                }
                dp[t][d] = max;
            }
        }
        System.out.println(dp[k][n-1]);
        
    }

}
