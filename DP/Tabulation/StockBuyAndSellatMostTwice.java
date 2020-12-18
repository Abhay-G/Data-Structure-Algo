import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = maxProfit(arr,n);
        System.out.println(ans);
    }
    public static int maxProfit(int arr[], int n)
    {
        int past[] = new int[n];
        int future[] = new int[n];
        past[0] = 0;
        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            int cp = arr[i]-min;
            if(past[i-1]<cp)
            {
                past[i]= cp;
            }
            else{
                past[i] = past[i-1];
            }
        }
        future[n-1] = 0;
        int max = arr[n-1];
        for(int i = n-2;i>=0;i--)
        {
          if(arr[i]>max)
          {
              max = arr[i];
          }
          int cp = max-arr[i];
          if(future[i+1]<cp)
          {
              future[i] = cp;
          }
          else{
              future[i] = future[i+1];
          }
  
        }
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            past[i]+= future[i];
            if(past[i]>max)
            {
                max = past[i];
            }
        }
        return max;
        
        
    }
}
