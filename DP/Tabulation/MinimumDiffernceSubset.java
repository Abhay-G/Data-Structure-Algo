public class Solution {
    public int solve(int[] arr) {
        
        int sum = 0;
        for(int k:arr)
        {
            sum+=k;
        }
        boolean t[][] = new boolean[arr.length+1][sum+1];
        for(int i=0;i<arr.length+1;i++)
        {
            t[i][0] = true;
        }
        for(int i=1;i<sum+1;i++)
        {
            t[0][i] = false;
        }
        getMinDiff(arr,arr.length,sum,t);
        int max = 0;
        for(int i=0;i<sum/2 +1;i++)
        {
            if(t[arr.length][i])
            {
                if(max<i)
                {
                    max = i;
                }
            }
        }
        return (sum-2*max);
    }
   
    static void getMinDiff(int arr[], int n, int range, boolean t[][])
    {
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<range+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j] = t[i-1][j-arr[i-1]] | t[i-1][j];
                }
                else
                t[i][j] = t[i-1][j];
            }
        }
        
    }
}
