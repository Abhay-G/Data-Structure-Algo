/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    String x = sc.next();
		    String y = sc.next();
		    
		    
		    int [][]t = new int[m+1][n+1];
		    for (int i = 0; i <= m; i++)  
        { 
            for (int j = 0; j <= n; j++)  
            { 
                if (i == 0 || j == 0) 
                    t[i][j] = 0; 
            }
        }
		    int ans = lcss(x,y,m,n,t);
		    System.out.println(ans);
		    
		}

	}
	
	public static int lcss(String x, String y, int m, int n, int[][]t)
	{
	    int result = 0;
	    for(int i=1;i<m+1;i++)
	    {
	        for(int j=1;j<n+1;j++)
	        {
	            if(x.charAt(i-1) == y.charAt(j-1))
	            {
	                t[i][j] = t[i-1][j-1]+1;
	                result = Math.max(result, t[i][j]);
	            }
	            else
	            t[i][j] = 0;
	        }
	    }
	    return result;
	}
}
