class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (i != 0 && nums[i] == nums[i - 1])continue;
      for (int j = i + 1; j < nums.length; j++) {
        if (j != i + 1 && nums[j] == nums[j - 1])continue;
        int sum = target - nums[j] - nums[i];
        int lo = j + 1;
        int hi = nums.length - 1;
        while (lo < hi) {
          int twosum = nums[lo] + nums[hi];
          if (twosum < sum) {
            lo++;
          }
          else if (twosum > sum) {
            hi--;
          } else {
            if (nums[lo] + nums[hi] == sum) {
              res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
              while (lo < hi && nums[lo] == nums[lo + 1])lo++;
              while (lo < hi && nums[hi] == nums[hi - 1])hi--;
              lo++;
              hi--;
            }
          }
        }
      }

    }
    return res;
  }
}
