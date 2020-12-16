import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i] = sc.nextInt();
       }
       int amt = sc.nextInt();
       
       int t[] = new int[amt+1];
       t[0] = 1;
       for(int i= 1;i<=amt;i++)
       {
           for(int j = 0;j<n;j++)
           {
               if(arr[j]<=i)
               {
                   t[i] += t[i-arr[j]];
               }
           }
       }
       
       System.out.println(t[amt]);
       
    }
}
