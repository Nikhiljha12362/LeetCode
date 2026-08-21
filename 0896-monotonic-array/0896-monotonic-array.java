class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incresing = true;
        boolean decreasing = true;
      int n = nums.length;
      for(int i=0;i<n-1;i++){
        if(nums[i]>nums[i+1]){
            incresing =false;
        }
        if(nums[i]<nums[i+1]){
            decreasing = false;
        }
      }
      return incresing || decreasing;
    }
}