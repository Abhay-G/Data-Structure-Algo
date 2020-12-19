public static int[] solve(int[] arr){
   // solve
   int nge[] = new int[arr.length];
   Stack<Integer> st = new Stack<>();
   for(int i=arr.length-1;i>=0;i--)
   {
       if(i==arr.length-1)
       {
           nge[i] =-1;
       }
       else{
           if(st.peek()>arr[i])
           {
               nge[i] = st.peek();
           }
           else{
               while(!st.isEmpty()&&st.peek()<arr[i])
               {
                   st.pop();
               }
               if(st.isEmpty())
               {
                   nge[i] = -1;
               }
               else{
                   nge[i] = st.peek();
               }
           }
           
       }
       st.push(arr[i]);
   }
   return nge;
 }
