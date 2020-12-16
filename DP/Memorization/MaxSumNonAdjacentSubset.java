import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         int t[] = new int[n+1];
         Arrays.fill(t,-1);
         for(int i=0;i<n;i++)
         {
             arr[i] = sc.nextInt();
         }
         System.out.println(admax(n,arr,t));

    }
    public static int admax(int n, int arr[], int[]t)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return arr[0];
        }
        if(t[n]!=-1)
        {
            return t[n];
        }
        
        int inc = admax(n-2,arr,t)+arr[n-1];
        int incminus = admax(n-2,arr,t);
        int ex = admax(n-1,arr,t);
        return t[n] = Math.max(Math.max(inc,incminus),ex);
    }
}
