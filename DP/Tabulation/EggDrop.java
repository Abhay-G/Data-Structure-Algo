class Solution 
{
    static int superEggDrop(int e, int f) 
	{
	    int t[][] = new int[e+1][f+1];
	    for(int[] k:t)
	    {
	        Arrays.fill(k,-1);
	    }
	    
	    return solve(e,f,t);
	   
	}
	
	static int solve(int e, int f, int[][]t)
	{
	    if(e==1)
	    {
	        return t[e][f] = f;
	    }
	    if(f==0||f==1)
	    {
	        return t[e][f] = f;
	    }
	    if(t[e][f]!=-1)
	    {
	        return t[e][f];
	    }
	    
	    int mn = Integer.MAX_VALUE;
	    
	    for(int k=1;k<=f;k++)
	    {
	        int low = 0;
	        int high = 0;
	        if(t[e-1][k-1]!=-1)
	        {
	            low = t[e-1][k-1];
	        }
	        else{
	            t[e-1][k-1] = low = solve(e-1,k-1,t);
	        }
	        if(t[e][f-k]!=-1)
	        {
	            high = t[e][f-k];
	        }
	        else{
	            t[e][f-k] = high = solve(e,f-k,t);
	        }
	        
	        int temp = 1+ Math.max(low,high);
	        
	        mn = Math.min(mn,temp);
	    }
	    return t[e][f] = mn;
	}
	
}
