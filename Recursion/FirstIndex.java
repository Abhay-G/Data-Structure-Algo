import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
       System.out.println(firstIndex(arr,0,x)); 
    }

    public static int  firstIndex(int[] arr, int n, int x){
        
        if(n==arr.length)
        {
            return -1;
        }
        
        if(arr[n]==x)
        {
            return n;
        }
        else{
            return firstIndex(arr,n+1,x);
        }
       
        
        
        
    }

}
