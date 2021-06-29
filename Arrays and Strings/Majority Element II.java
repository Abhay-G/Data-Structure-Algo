class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int v1 = -1, v2=-1, c1=0, c2=0, i=0;
        while(i<nums.length){
            if(nums[i]==v1){
                c1++;
            }else if(nums[i]==v2){
                c2++;
            }else if(c1==0){
                v1 = nums[i];
                c1++;
            }else if(c2==0){
                v2 = nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        c1=0;
        c2=0;
        for(int k:nums){
            if(k==v1){
                c1++;
            }else if(k == v2){
                c2++;
            }
        }
        
        if(c1>nums.length/3){
            list.add(v1);
        }
        if(c2>nums.length/3){
            list.add(v2);
        }
        return list;
    }
}
