import java.util.*;
import java.lang.*;
import java.io.*;

class NextPermutation {
	public static void main (String[] args) {
		//code
		   
		   Scanner s = new Scanner(System.in);
		   
		       int t = s.nextInt();
		  
		   
		   while(t-->0)
		   {
		       int n = s.nextInt();
		       int arr[] = new int[n];
		      
		       
		       for(int i=0;i<n;i++)
		       {
		           arr[i] = s.nextInt();
		       }
		       
		       nextper(arr,n);
		       
		       for(int k : arr)
		       {
		           System.out.print(k+" ");
		       }
		       System.out.println();
		       
		       
		       
		   }
	
	}
	public static void nextper(int arr[], int n)
	{
	    int swap = -1;  
	    
	    //find the irregular index from right which is swap
	    for(int i= n-1;i>0;i--)
		       {
		           if(arr[i-1] >= arr[i] )
		           {
		               continue;
		           }
		           else{
		               swap = i-1;
		               break;
		           }
		       }
		       // no irregular index found then it does not have next permutation so sort it.
		       if(swap==-1)
		       {
		           Arrays.sort(arr);
		           return;
		           
		       }
		       
		       //find nearest and larger element to irregular index
		       int swap2 = 0;
		       int cmin = Integer.MAX_VALUE, gmin = cmin;
		       for(int i = swap+1;i<n;i++)
		       {
		           if(arr[i]>arr[swap])
		           cmin = arr[i] - arr[swap];
		           if(cmin<gmin)
		           {
		               gmin = cmin;
		               swap2 = i;
		               
		           }
		       }
		       //swap both
		       int temp = arr[swap];
		       arr[swap] = arr[swap2];
		       arr[swap2] = temp;
		       
		       //after swapping arrange in ascending order from swap+1 to end.
		       Arrays.sort(arr,swap+1,n);
		       return;
		       
	}
}
