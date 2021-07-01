class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right){
        int res =0;
        int start = 0;
        int end = 0;
        int window = 0;
        while(end<nums.length){
            
            if(nums[end]>= left && nums[end]<=right){
                 window = end-start+1;
            }else if(nums[end]<left){
                window = window;
            }else{
                window = 0;
                start = end+1;
            }
            res+= window;
            end++;
        }
        return res;
    }
}
