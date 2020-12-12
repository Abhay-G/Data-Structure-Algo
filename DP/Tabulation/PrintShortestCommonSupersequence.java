import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		
		String x= "acbcf";
		String y = "abcdaf";
		int m = x.length();
		int n = y.length();
		
		int t[][] = new int[m+1][n+1];
		for(int i=0;i<m+1;i++)
		{
		    for(int j=0;j<n+1;j++)
		    {
		        if(i==0||j==0)
		        {
		            t[i][j] = 0;
		        }
		    }
		}
		lcs(x,y,m,n,t);
		String ans = scs(x,y,m,n,t);
		System.out.println(ans);
	}
	public static void lcs(String x, String y, int m, int n, int[][]t)
	{
	    	for(int i=1;i<m+1;i++)
		{
		    for(int j=1;j<n+1;j++)
		    {
		        if(x.charAt(i-1)==y.charAt(j-1))
		        {
		            t[i][j] = t[i-1][j-1]+1;
		        }
		        else
		        t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
		    }
		}
	}
	public static String scs(String x, String y, int m ,int n, int[][]t)
	{
	    StringBuilder ans = new StringBuilder();
	    int i=m,j=n;
	    while(i>0&&j>0){
	        if(x.charAt(i-1)==y.charAt(j-1))
	        {
	            ans.append(x.charAt(i-1));
	            i--;
	            j--;
	        }
	        else{
	            if(t[i-1][j]>t[i][j-1])
	            {
	                ans.append(x.charAt(i-1));
	                i--;
	            }
	            else if(t[i][j-1]>t[i-1][j])
	            {
	                ans.append(y.charAt(j-1));
	                j--;
	            }
	        }
	    }
	    while(i>0)
	    {
	        ans.append(x.charAt(i-1));
	        i--;
	    }
	     while(j>0)
	    {
	        ans.append(y.charAt(j-1));
	        j--;
	    }
	    return ans.reverse().toString();
	}
}
