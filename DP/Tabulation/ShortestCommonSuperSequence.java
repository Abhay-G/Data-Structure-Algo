public static int shortestCommonSupersequence(String X, String Y, int m, int n)
{
    //Your code here
    
    int [][] t =new int[m+1][n+1];
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(i==0||j==0)
            {
                t[i][j] = 0;
            }
        }
    }
    int ss = lcs(X,Y,m,n,t);
    return m+n-ss;
    
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
            else{
                t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
    }
    return t[m][n];
    
}
