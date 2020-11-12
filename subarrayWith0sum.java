import java.util.*;
import java.lang.*;
import java.io.*;

class subarrayWith0sum {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		while(t-->0)
		{
		    boolean found = false;
		    int sum = 0;
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = s.nextInt();
		    }
		    HashSet<Integer> hs = new HashSet<Integer>();
		    
		    for(int i=0;i<n;i++)
		    {
		       sum += arr[i];
		       
		       if(hs.contains(sum)||hs.contains(0))
		       {
		           found = true;
		           break;
		       }
		       else{
		           hs.add(sum);
		       }
		    }
		    if(found)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
