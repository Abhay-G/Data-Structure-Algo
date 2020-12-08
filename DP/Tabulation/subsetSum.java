class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int k:arr)
        {
            sum+=k;
        }
        if(sum%2!=0)
        {
            return 0;
        }
        sum = sum/2;
        boolean t[][] = new boolean[N+1][sum+1];
         for(int i=0;i<arr.length+1;i++)
        {
            t[i][0] = true;
        }
         for(int i=1;i<sum+1;i++)
        {
            t[0][i] = false;
        }
        if(subsetsum(arr,sum,N,t))
        {
            return 1;
        }
        else 
        return 0;
        // code here
    }
    
    static boolean subsetsum(int arr[], int sum, int n,boolean t[][])
    {
       
       for(int i=1;i<n+1;i++)
       {
           for(int j=1;j<sum+1;j++)
           {
               if(arr[i-1]<=j)
               t[i][j] = t[i-1][j-arr[i-1]] | t[i-1][j];
               else
               t[i][j] = t[i-1][j];
           }
       }
       return t[n][sum];
    }
}
