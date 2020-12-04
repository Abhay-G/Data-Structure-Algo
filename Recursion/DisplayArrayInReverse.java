import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

     public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        displayArrReverse(arr,n);
        
    }

    public static void displayArrReverse(int[] arr, int n){
        
        if(n==1)
        {
            System.out.println(arr[arr.length-1]);
            return;
        }
        displayArrReverse(arr,n-1);
        System.out.println(arr[arr.length-n]);
        
    }
