class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        
        //an array that contains product of all the left index elements to that index(included)
        left[0] = nums[0];
        for(int i=1; i<nums.length;i++){
            left[i] = left[i-1]*nums[i];
        }
        //an array that contains product of all the right index elements to that index(included)
        right[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            right[i] = right[i+1]*nums[i];
        }
      
        //filling nums array accordingly
        for(int i=0; i<nums.length; i++){
            if(i==0){
                nums[i] = right[i+1];
            }else if(i==nums.length-1){
                nums[i] = left[i-1];
            }else{
                nums[i] = left[i-1]*right[i+1];
            }
        }
        return nums;
    }
}
