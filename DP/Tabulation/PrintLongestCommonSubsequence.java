import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		String x = "abcdef";
		String y = "abdgf";
		int[][] t = new int[7][6];
		for(int i=0;i<7;i++)
		{
		    for(int j=0;j<6;j++)
		    {
		        if(i==0||j==0)
		        {
		            t[i][j] = 0;
		        }
		    }
		}
		getTable(x,y,x.length(),y.length(),t);
		StringBuilder str = new StringBuilder();
		int i =x.length(), j = y.length();
		while(i>0 && j>0)
		{
		    if(x.charAt(i-1)==y.charAt(j-1))
		    {
		        str.append(x.charAt(i-1));
		        i--;
		        j--;
		    }
		    else{
		        if(t[i-1][j]>t[i][j-1])
		        {
		            i--;
		        }
		        else
		            j--;
		        
		    }
		   
		}
		 System.out.println(str.reverse().toString());
	
		
	}
		public static void getTable(String x, String y, int m, int n, int[][]t)
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
		            t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
		        }
		    }
		}
}
