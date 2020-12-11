class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int m = str1.length();
	    int n = str2.length();
         int[][] t= new int[m+1][n+1];
         for(int i=0;i<=m;i++)
	    {
	        for(int j=0;j<=n;j++)
	        {
	            if(i==0||j==0)
	            {
	                t[i][j] =0;
	            }
	        }
	    }
	    int a = lcs(str1,str2,m,n,t);
	    int del = m-a;
      int ins = n-a;
      return del+ins;
         
	} 
	
	public static int lcs(String x, String y, int m, int n, int t[][])
	{
	    for(int i=1;i<=m;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(x.charAt(i-1)==y.charAt(j-1))
	            {
	                t[i][j] = 1+t[i-1][j-1];
	            }
	            else
	            t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
	        }
	    }
	    return t[m][n];
	}
}
