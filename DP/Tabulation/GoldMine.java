import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]goldMine = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                goldMine[i][j] = sc.nextInt();
            }
        }
        int t[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            t[i][m-1] = goldMine[i][m-1];
        }
        maxGold(n,m,t,goldMine);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           ans = Math.max(ans,t[i][0]);
        }
        System.out.println(ans);
        
    }
    
    public static void maxGold(int n, int m, int t[][], int[][]goldMine)
    {
        for(int j = m-2;j>=0;j--)
        {
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                {
                    t[i][j] = Math.max(t[i][j+1],t[i-1][j+1]) + goldMine[i][j];
                }
                else if(i==0)
                {
                    t[i][j] = Math.max(t[i][j+1],t[i+1][j+1]) + goldMine[i][j];
                }
                else {
                    t[i][j] = Math.max(Math.max(t[i][j+1],t[i-1][j+1]),t[i+1][j+1]) + goldMine[i][j];
                }
            }
        }
        
    }

}
