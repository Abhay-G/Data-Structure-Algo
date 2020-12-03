import java.util.*;
import java.lang.*;
import java.io.*;

class AllPermutation{
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        String str = s.next();
	        char tempArray[] = str.toCharArray();
	        Arrays.sort(tempArray);
	        String str1 = new String(tempArray);
	        String op ="";
	        solve(str1,op);
	        System.out.println();
	    }
	}
	public static void solve(String str,String asf)
	{
	    if(str.length()==0)
	    {
	        System.out.print(asf+" " );
	        return;
	    }
	    
	    for(int i=0;i<str.length();i++)
	        {
	            char c = str.charAt(i);
	            String left = str.substring(0,i);
	            String right = str.substring(i+1);
	            String roq = left+right;
	            solve(roq, asf+c);
	        }
	    
	}
}
