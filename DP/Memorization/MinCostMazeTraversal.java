import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maze[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                maze[i][j] = sc.nextInt();
            }
        }
        int t[][] = new int[m+1][n+1];
        for(int k[]:t)
        {
            Arrays.fill(k,-1);
        }
        int ans = minCost(0,0,m-1,n-1,maze,t);
        System.out.println(ans);
        
    }
    
    public static int minCost(int i, int j,int m, int n, int[][]maze,int[][]t)
    {
        
        if (i > m || j > n) 
            return Integer.MAX_VALUE; 
        if (m == i && n == j) 
            return maze[m][n]; 
    
         if(t[i][j]!=-1)
         {
             return t[i][j];
         }
        return t[i][j]= maze[i][j]+Math.min(minCost(i+1,j,m, n,maze,t),minCost(i,j+1,m, n,maze,t));
    }


}
