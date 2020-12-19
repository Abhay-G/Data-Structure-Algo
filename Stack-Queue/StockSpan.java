import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   int index[] = new int[arr.length];
   Stack<Pair> st = new Stack<>();
   for(int i=0;i<arr.length;i++)
   {
       if(st.isEmpty())
       {
           index[i] = -1;
       }
       else{
           if(!st.isEmpty()&&arr[i]<st.peek().val)
           {
               index[i] = st.peek().idx;
           }
           else{
               while(!st.isEmpty()&&st.peek().val<arr[i])
               {
                   st.pop();
               }
               if(st.isEmpty())
               {
                   index[i] = -1;
               }
               else{
                   index[i] = st.peek().idx;
               }
           }
           
       }
       st.push(new Pair(i,arr[i]));
   }
     for(int k=0;k<arr.length;k++)
       {
           index[k] = k-index[k];
       }
       return index;
   
 }

}
class Pair{
    int idx;
    int val;
    public Pair(int idx, int val)
    {
        this.idx = idx;
        this.val = val;
    }
}
