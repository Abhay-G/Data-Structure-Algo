class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        
        res = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            al.add(-11);// constraints say that -11 will not be present in given array elements as they are from -10<=arr[i]<=10
        }
        
        addPermutation(nums, 0, al);
        return res;
    }
    public void addPermutation(int arr[], int idx, List<Integer>al){
        
        if(idx==arr.length){
            res.add(new ArrayList<Integer>(al));
            return;
        }
        for(int i=0; i<al.size();i++){
            if(al.get(i)==-11){
                al.set(i, arr[idx]);
                addPermutation(arr, idx+1, al);
                al.set(i, -11);
            }
        }
    }
}
