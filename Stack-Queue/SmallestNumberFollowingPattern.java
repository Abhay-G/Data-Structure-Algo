import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    // code
    
    int num = 1;
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(ch=='d')
        {
            st.push(num);
            num++;
        }
        else
        {
            st.push(num);
            num++;
            
            while(st.size()>0)
            {
                System.out.print(st.pop());
            }
        }
    }       
            // when there is no 'i' and so numbers are left in the string
            st.push(num);
            while(st.size()>0)
            {
                System.out.print(st.pop());
            }
 }
}
