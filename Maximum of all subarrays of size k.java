class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code 
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Deque<Integer> que = new ArrayDeque<>();
        
        while(j<arr.length){
            
            while(que.size()>0&&que.peekLast()<arr[j]){
                que.removeLast();
            }
             que.addLast(arr[j]);
            if(j-i+1<k){ 
                j++;
            }
            else if(j-i+1==k){
              ans.add(que.peekFirst());
              if(!que.isEmpty()&&arr[i]==que.peekFirst()){
                  que.removeFirst();
              }
              i++;
              j++;
            }
        }
        return ans;
    }
}
