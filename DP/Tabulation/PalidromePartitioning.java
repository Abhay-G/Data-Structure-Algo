class Solution
{
    static boolean isPalindrome(String s,int i,int j)
    {
        if(i==j)   //single character string
        {
            return true;
        }
        
        if(i>j) //empty string
        {
            return true;
        }
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;  //when loop ends smoothly means it is palindrome
    }
    
    
    
    static int solve(String s ,int i,int j,int t[][])
    {
        
        //base condition
        if(i>=j)
        {
            return 0;
        }
        
        
        if(t[i][j]!=-1)
        {
            return t[i][j];
        }
        if(isPalindrome(s,i,j)==true)
        {
            t[i][j]=0;
            return 0;
        }
        
        int minn=Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++)
        {
            int left;
            int right;
            
            if(t[i][k]!=-1)
            {
                left=t[i][k];
            }
            else
            {
                left=solve(s,i,k,t);
                t[i][k] =left;
            }
            
            
            if(t[k+1][j]!=-1)
            {
                right=t[k+1][j];
            }
            else
            {
                right=solve(s,k+1,j,t);
                t[k+1][j] = right;
            }
            
            
            int temp_ans=1+left+right;
            
            //int temp_ans=1+solve(s,i,k,t)+solve(s,k+1,j,t);
            
            if(temp_ans<minn)
            {
                minn=temp_ans;
            }
            
        }
        
        t[i][j]=minn;
        return minn; 
        
    }
    
    
    static int palindromicPartition(String s)
    {
        int t[][]=new int[501][501];
        
        for(int i=0;i<s.length()-1;i++)
        {
            Arrays.fill(t[i],-1);
        }
        
        int result=solve(s,0,s.length()-1,t);
        
        return result;
    }
}
