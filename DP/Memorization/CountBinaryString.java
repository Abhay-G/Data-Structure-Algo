import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int t[][] = new int[n+1][2];
    for(int k[]:t)
    {
        Arrays.fill(k,-1);
    }
    int ans = count(n,0,t)+count(n,1,t);
    System.out.println(ans);
    
 }
 public static int count(int n, int bi,int t[][])
 {
     if(n==0)
     {
         return 0;
     }
     if(t[n][bi]!=-1)
     {
         return t[n][bi];
     }
     if(n==1)
     {
         return 1;
     }
     
     if(bi==0)
     {
         return t[n][bi] = count(n-1,1,t);
     }
     else
     {
         return t[n][bi]=count(n-1,0,t)+count(n-1,1,t);
     }
    
 }

}
