class Solution {
    public void rotate(int[] nums, int k) {
        int n  = nums.length;
         k =k%n;
        int [] temp = new int[n];
        for(int i =0;i<n;i++) {
            temp[(i+k)%n] = nums[i]; // temp[5,6,7,1,2,3,4,]
            
        }
        // temp array  se nums array  mei coppy krne ke liye 
        for(int i=0;i<n;i++){
         nums[i] = temp[i];
        }


        
    }
}