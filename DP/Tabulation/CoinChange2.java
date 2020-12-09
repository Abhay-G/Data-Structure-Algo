class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
            int t[][] = new int[M+1][V+1];
            for(int i=0;i<V+1;i++)
            {
                t[0][i] = Integer.MAX_VALUE-1;
            }
            for(int i=1;i<M+1;i++)
            {
                t[i][0] = 0;
            }
            int ans = noOfcoins(coins,M,V,t);
            if(ans==Integer.MAX_VALUE-1)
            {
                return -1;
            }
            else return ans;
	} 
	
	static int noOfcoins(int[] coins, int n, int sum, int[][]t)
	{
	    for(int i=1;i<n+1;i++)
	    {
	        for(int j=1;j<sum+1;j++)
	        {
	            if(coins[i-1]<=j)
	            {
	                t[i][j] = Math.min(t[i][j-coins[i-1]]+1 ,t[i-1][j]);
	            }
	            else
	            t[i][j] = t[i-1][j];
	        }
	    }
	    return t[n][sum];
	}
}
