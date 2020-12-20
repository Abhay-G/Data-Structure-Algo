import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    int nge[] = new int[n];
    Stack<Integer> st = new Stack<>();
    st.push(arr.length-1);
    nge[arr.length-1] = arr.length;
    for(int i = n-2;i>=0;i--)
    {
        while(!st.isEmpty()&&arr[i]>=arr[st.peek()])
        {
            st.pop();
        }
        if(st.size()==0)
        {
            nge[i] = arr.length;
        }
        else
        {
            nge[i] = st.peek();
        }
         st.push(i);
    }
    
    int j=0;
    for(int i=0;i<=n-k;i++)
    {
       if(j<i)
       {
           j=i;
       }
       while(nge[j]<i+k)
       {
           j= nge[j];
       }
       System.out.println(arr[j]);
    }
    
 }
}
