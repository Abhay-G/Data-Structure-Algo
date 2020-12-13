import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test-->0)
		{
		    int n = scan.nextInt();
		    scan.nextLine();
		    String str = scan.nextLine();
		    int t[][][] = new int[n+1][n+1][2];
		    for(int i=0;i<n+1;i++)
		    {
		        for(int j=0;j<n+1;j++)
		        {
		            for(int k=0;k<2;k++)
		            {
		                t[i][j][k] = -1;
		            }
		        }
		    }
		    int ans = solve(0,n-1,t,str,1);
		    System.out.println(ans);
		    
		    
		}
	}
	
	    public static int solve(int start,int end,int[][][] dp,String A,int truth)
    {
        //Truth 1 means 'T' or true value
        //Truth 0 means 'F' or false value
        
        if(start==end)
        {
            if(A.charAt(start)=='T') 
            {
                if(truth==1) return 1;
                return 0;
            }
            else if(A.charAt(start)=='F')
            {
                if(truth==1) return 0;
                return 1;
            }
        }
        
        if(dp[start][end][truth]!=-1) return dp[start][end][truth];
        
        int ans=0;
        
        for(int i=start+1;i<=end-1;i=i+2)
        {
            int left_true=solve(start,i-1,dp,A,1);
            int left_false=solve(start,i-1,dp,A,0);
                
            int right_true=solve(i+1,end,dp,A,1);
            int right_false=solve(i+1,end,dp,A,0);
            if(A.charAt(i)=='|')
            {
                int comb=0;
                
                if(truth==1)
                {
                   comb=((left_true*right_true)%1003 + (left_true*right_false)%1003
                         + (left_false*right_true)%1003)%1003;
                }
                else
                {
                    comb=(left_false*right_false)%1003;
                }
                
                ans=(ans+comb)%1003;
            }
            else if(A.charAt(i)=='&')
            {
               
                
                if(truth==1)
                {
                   ans=(ans+(left_true*right_true)%1003)%1003;
                }
                else
                {
                    int comb=((left_false*right_false)%1003 + (left_true*right_false)%1003
                         + (left_false*right_true)%1003)%1003;
                    ans=(ans+comb)%1003;
                }
            }
            else if(A.charAt(i)=='^')
            {
              
                
                int comb=0;
                
                if(truth==1)
                {
                   comb=((left_true*right_false)%1003 + (left_false*right_true)%1003)%1003;
                }
                else
                {
                    comb=((left_true*right_true)%1003 + (left_false*right_false)%1003)%1003;
                }
                ans=(ans+comb)%1003;
            }
        }
        
        dp[start][end][truth]=ans;
        return ans;
    }
}
