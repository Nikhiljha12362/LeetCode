class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length;
        int candidate1=Integer.MIN_VALUE;
        int candidate2 =Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }else if( count1==0){
                candidate1 = nums[i];
                count1 =1;
            }else if(count2==0){
                candidate2 = nums[i];
                count2 =1;
            }else{
                count1--;
                count2--;
            }
        }
        int actualCount1 =0;
        int actualCount2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==candidate1){
                actualCount1++;
            }
             if(nums[i]==candidate2){
                actualCount2++;
            }
        }
        ArrayList<Integer>ans = new ArrayList<>();
        if(actualCount1>n/3){
            ans.add(candidate1);
        }
         if(actualCount2>n/3){
            ans.add(candidate2);
        }
        return ans;
    }
}