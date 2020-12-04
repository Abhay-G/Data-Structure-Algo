class BalancedParenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
       Stack<Character> st = new Stack<>();
       boolean ans = true;
       int i;
       for(i=0;i<x.length();i++)
    {
        char c = x.charAt(i);
        if(c=='{'|| c=='['||c=='(')
        {
            st.push(c);
            
        }
        else
        {
            if(!st.isEmpty())
            {
                
            if(c==')' && st.peek()=='(')
            {
                st.pop();
            }
            else if(c=='}' && st.peek()=='{')
            {
                st.pop();
            }
            else if(c==']' && st.peek()=='[')
            {
                st.pop();
            }
            else{
                ans = false;
            }
        }
        else{
            ans = false;
        }
        }
        
    }
    if(i==x.length()&&!st.isEmpty())
    {
    ans = false;
    }
       
           return ans;
       
          
    }
}
