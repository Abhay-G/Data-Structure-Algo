import java.util.*;

class Main{
    
    public static void main(String args[])
    {
        int arr[] = {1,3,5};
        int ans = equalPartition(arr.length,arr);
        System.out.println(ans);
    }
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
       int t[][] = new int[arr.length+1][sum+1];
           for(int []row:t)
           {
               Arrays.fill(row,-1);
           }
       int ans = subsetsum(arr,sum,0,0,t);
       return ans;
       
    }
    
    public static int subsetsum(int arr[], int sum, int sos,int n, int[][]t)
       {
           
           
           if(n==arr.length)
           {
               if(sos == sum)
               {
                   return 1;
               }
               return 0;
           }
           
           if(sos>sum)
           {
               return 0;
           }
           if(t[n][sos]!=-1)
           {
               return t[n][sos];
           }
           
           return t[n][sos] = ((subsetsum(arr,sum,sos+arr[n],n+1,t))|(subsetsum(arr,sum,sos,n+1,t)));
           
       }
}
