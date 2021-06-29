class Solution {
    public int maxChunksToSorted(int[] arr) {
        
       
        int rightMin[] = new int[arr.length+1];
        rightMin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1; i>=0;i--){
                rightMin[i] = Math.min(rightMin[i+1], arr[i]);
        }
        int leftMax = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            leftMax = Math.max(leftMax, arr[i]);
            if(leftMax<=rightMin[i+1]){
                count++;
            }
        }
        return count;
        
    }
}
