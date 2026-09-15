class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
     int left =0;
     int right =n-1;
     int sum =0;
     for(int i=0;i<n;i++){
        sum =sum+nums[i];
     }
     for(int i=0;i<n;i++){
       
        right = sum-left-nums[i];
        if(left==right){
            return i;
        }
        left = left+nums[i];
     }
     return -1;
       }
    
}