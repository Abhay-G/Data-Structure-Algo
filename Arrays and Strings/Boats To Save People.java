class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int res = 0;
        while(i<=j){
            if(arr[i]+arr[j] <= limit){
                res++;
                i++;
                j--;
            }else{
                 res++;
                if(arr[i]>=arr[j]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return res;
    }
}
