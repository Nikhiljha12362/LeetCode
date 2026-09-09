class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int left =0;
        int sum =0;
      for(int num:nums){
         sum = sum+num;  //30
      }
      for(int i=0;i<n;i++){
      
       int  right = sum-nums[i]-left;
        if(left==right){
            return i;
        }
          left =left+nums[i];
      }
      return -1;

       }
    
}