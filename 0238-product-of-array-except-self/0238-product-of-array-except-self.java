class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int left =1;
        int right =1;
       int []product =new int[n];
       product[0]=1;
       for(int i=1;i<n;i++){
        left =left*nums[i-1];
        product[i]=left;
       }
     for(int i=n-1;i>=0;i--){
       product[i] =product[i]*right;
       right =right*nums[i];
     } 
     return product; 
    }
}                                                                                                                                                                                                                                                                                                                                                                                   