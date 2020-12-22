import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String>post = new Stack<>();
     Stack<String>pre = new Stack<>();
    Stack<Character>ops = new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);
        if(ch=='(')
        {
           ops.push(ch);   
        }
        else if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
            post.push(ch+"");
            pre.push(ch+"");
            
        }
        else if(ch==')')
        {
            while(ops.peek()!='(')
            {
                char op = ops.pop();
                String postv2 = post.pop();
                String postv1 = post.pop();
                String v = postv1+postv2+op;
                post.push(v);
                
                
                String prev2 = pre.pop();
                String prev1 = pre.pop();
                String vp = op+prev1+prev2;
                pre.push(vp);
                
            }
            ops.pop(); 
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            while(ops.size()>0&&ops.peek()!='('&&precedence(ch)<=precedence(ops.peek()))
            {
                
                char op = ops.pop();
                String postv2 = post.pop();
                String postv1 = post.pop();
                String v = postv1+postv2+op;
                post.push(v);
                
                
                String prev2 = pre.pop();
                String prev1 = pre.pop();
                String vp = op+prev1+prev2;
                pre.push(vp);
                
            }
            ops.push(ch);
         
            
        }
    }
    while(ops.size()>0)
            {
                char op = ops.pop();
                String postv2 = post.pop();
                String postv1 = post.pop();
                String v = postv1+postv2+op;
                post.push(v);
                
                
                String prev2 = pre.pop();
                String prev1 = pre.pop();
                String vp = op+prev1+prev2;
                pre.push(vp);
            }
            System.out.println(post.peek());
            System.out.println(pre.peek());
    
 }
 public static int precedence(char ch)
 {
     if(ch=='+'||ch=='-')
     {
         return 1;
     }
     else if(ch=='*'||ch=='/')
     {
         return 2;
     }
     else{
         return 0;
     }
 }
}
