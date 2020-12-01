public class Main
{
	public static void main(String[] args) {
	
		String str = "aaaabbaa";
		int max = 0;
		String ans="";
		int temp = 0;
		 for(int i=0;i<str.length();i++)
		    {
		        for(int j=i+1;j<str.length();j++)
		        {
		            if(isPal(str.substring(i,j+1)))
		            {
		                
		                temp = j-i+1;
		                if(temp>max)
		                {
		                    ans = str.substring(i,j+1);
		                    max = temp;
		                }
		            }
		        }
		    }
		    System.out.println(ans);
		    
		}
	
	public static boolean isPal(String s)
	{
	    int i = 0;
	    int j = s.length()-1;
	    while(i<=j)
	    {
	        if(s.charAt(i)!=s.charAt(j))
	        {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
}
