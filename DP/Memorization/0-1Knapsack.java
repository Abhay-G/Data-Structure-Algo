class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int t[][] = new int[1001][1001];
    public Knapsack()
    {
         for(int []row:t)
        {
        Arrays.fill(row,-1);
        }
        
    }
   
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         
         if(n==0||W==0)
         {
             return 0;
         }
         if(t[n][W]!=-1)
         {
             return t[n][W];
         }
         if(wt[n-1]<=W)
         {
             t[n][W] = Math.max((val[n-1]+knapSack(W-wt[n-1],wt,val,n-1)),knapSack(W,wt,val,n-1));
             return t[n][W];
         }
         else
          return t[n][W] = knapSack(W,wt,val,n-1);
         
    } 
}
