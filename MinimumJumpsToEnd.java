import java.util.*;

public class MinimumJumpsToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
        int n = arr.length;
        System.out.print("Min jumps to reach the end is : " + minJumps(arr,n));
        
        
        
       
	}
	public static int minJumps(int arr[], int n)
	{
		int maxReachable, stepsPossible,jump;
        maxReachable = arr[0];
        jump = 1;
        stepsPossible = arr[0];
        
        for(int i=1;i<n;i++)
        {
        	if(i==n-1)
        	{
        		return jump;
        	}
        	maxReachable = Math.max(maxReachable, i+arr[i]);
        	stepsPossible--;
        	if(stepsPossible==0)
        	{
        		jump++;
        		if(i>=maxReachable)
        		{
        			return -1;
        		}
        		stepsPossible = maxReachable-i;
        	}
        }
        return -1;
	}

}
