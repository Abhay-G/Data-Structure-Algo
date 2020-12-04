import java.io.*;
import java.util.*;

public class DisplayArray{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        displayArr(arr,n);
        
    }

    public static void displayArr(int[] arr, int n){
        
        if(n==1)
        {
            System.out.println(arr[n-1]);
            return;
        }
        displayArr(arr,n-1);
        System.out.println(arr[n-1]);
    }

}
