class Solution {
    int findLeftMost(int[]nums,int target,int n){
   int low =0;
    int high = n-1;
    int left_most =-1;
    while(low<=high){
        int mid = low+(high-low+1)/2;
       if(nums[mid]==target){
        left_most = mid; //possibly my answer
        high = mid-1; //look more on left may be our target is on my left
       } 
       else if(nums[mid]>target){
        high = mid-1;
       }else{
        low = mid+1;
       }
   
    }
   return left_most;
    }
   int findRightMost(int[]nums,int target,int n){
    int low =0;
    int high = n-1;
    int right_most = -1;
    while(low<=high){
        int mid = low+(high-low+1)/2;
        if(nums[mid]==target){
            right_most = mid;
            low = mid+1;
        }else if(nums[mid]<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }
    return right_most;
   }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
         int left_most =findLeftMost(nums,target,n);
         int right_most = findRightMost(nums,target,n);
         return new int[] {left_most,right_most};
    }
}