class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int MaxEnding = nums[0];
        int MinEnding = nums[0];
        int MaxSum = nums[0];
        int MinSum =nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int v1 = MaxEnding + nums[i];
            int v2 = MinEnding + nums[i];
            int v3 = nums[i];
           MaxEnding = Math.max(v1,v3);
           MinEnding = Math.min(v2,v3);
           MaxSum = Math.max(MaxSum,MaxEnding);
           MinSum = Math.min(MinSum,MinEnding); 

        }
        return Math.max(Math.abs(MaxSum),Math.abs(MinSum));
    }
}