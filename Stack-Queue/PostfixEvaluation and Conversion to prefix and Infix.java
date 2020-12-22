import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    
    Stack<Integer> st = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> prefix = new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);
        if(Character.isDigit(ch))
        {
            st.push(ch-'0');
            infix.push(ch+"");
            prefix.push(ch+"");
            
        }
        else
        {
            
          //processing for value
          int b = st.pop();
          int a = st.pop();
          int k = operation(a,b,ch);
          st.push(k);
          
          
         //processing for infix
         String inv2 = infix.pop();
         String inv1 = infix.pop();
         String in = "("+inv1+ch+inv2+")";
         infix.push(in);
         
         //processing for prefix  
         String prev2 = prefix.pop();
         String prev1 = prefix.pop();
         String pre = ch+prev1+prev2;
         prefix.push(pre);
         
        }
        
    }
    System.out.println(st.pop());
    System.out.println(infix.pop());
    System.out.println(prefix.pop());

    // code
 }
 public static int operation(int a, int b, char ch)
 {
     if(ch=='+')
     {
         return a+b;
     }
     else if(ch=='-')
     {
         return a-b;
     }
     else if(ch=='*')
     {
         return a*b;
     }
     else
     {
         return a/b;
     }
 }
 
}
