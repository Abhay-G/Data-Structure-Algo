class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int lastdistance = -1;
        for(int trip[] : trips){
            lastdistance = Math.max(lastdistance, trip[2]);
        }
        int arr[] = new int[lastdistance+1];
        for(int trip[]:trips){
            int start = trip[1];
            int end = trip[2];
            if(end<start)return false;
            int people = trip[0];
            arr[start] += people;
            arr[end] -= people;
        }
        for(int i=1; i<=lastdistance;i++){
            arr[i] = arr[i]+arr[i-1];
             if(arr[i]>capacity){
                return false;
            }
        }
        System.out.println(Arrays.toString(arr));
        return true;
    }
}
