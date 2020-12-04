import java.io.*;
import java.util.*;

public class MaxOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
       System.out.println(maxOfArray(arr,n)); 
    }

    public static int maxOfArray(int[] arr, int n){
        
        if(n==1)
        {
           
            return arr[n-1];
        }
        int x = maxOfArray(arr,n-1);
        if(x>=arr[n-1])
        {
            return x;
        }
        else{
            return arr[n-1];
        }
        
    }

}
