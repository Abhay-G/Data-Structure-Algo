import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []t = new int[n+1];
        t[0] = 1;
        int ans = solve(n,t);
        System.out.println(ans);
    }
    public static int solve(int n, int[]t)
    {
        
        for(int i=1;i<n+1;i++)
        {
            if(i>=1)
            {
                t[i] += t[i-1];
            }
             if(i>=2)
            {
                t[i] += t[i-2];
            }
             if(i>=3)
            {
                t[i] += t[i-3];
            }
        }
        return t[n];
    }


}
