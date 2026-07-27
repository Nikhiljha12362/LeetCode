class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n =nums.length;
        int ClosestSum = 100000;
        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right =n-1;
            while(left<right){
                int sum =nums[left]+nums[right]+nums[i];
                if(Math.abs(target-sum)<Math.abs(target-ClosestSum)){
                    ClosestSum =sum;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

      return ClosestSum ; 
    }
}