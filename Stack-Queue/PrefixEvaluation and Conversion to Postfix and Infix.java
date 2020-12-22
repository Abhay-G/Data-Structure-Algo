import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> st = new Stack<>();
    Stack<String>postfix = new Stack<>();
    Stack<String> infix = new Stack<>();
    for(int i=exp.length()-1;i>=0;i--)
    {
        char ch = exp.charAt(i);
        if(Character.isDigit(ch))
        {
            st.push(ch-'0');
            postfix.push(ch+"");
            infix.push(ch+"");
        }
        else{
            int a = st.pop();
            int b = st.pop();
            int v = operation(a,b,ch);
            st.push(v);
            
            //postfix work
            String pv1 = postfix.pop();
            String pv2 = postfix.pop();
            String p = pv1+pv2+ch;
            postfix.push(p);
            
            //infix work
            String iv1 = infix.pop();
            String iv2 = infix.pop();
            String in = "("+iv1+ch+iv2+")";
            infix.push(in);
        }
    }
    System.out.println(st.peek());
    System.out.println(infix.peek());
    System.out.println(postfix.peek());
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
