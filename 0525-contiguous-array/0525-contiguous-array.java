class Solution {
    public int findMaxLength(int[] nums) {
        int  n =nums.length;
        int zeroCount =0;
        int oneCount =0;
        int ans =0;
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int i=0;i<n;i++){
         if(nums[i]==0){
            zeroCount++;
         }
         else{
            oneCount++;
         }
         int differnce = zeroCount-oneCount;
         if(differnce==0){
            ans= Math.max(ans,i+1);
         }
         if(map.containsKey(differnce)){
            int idx = map.get(differnce);
            int len = i-idx;
            ans =Math.max(ans,len);
         }else{
            map.put(differnce,i);
         }
        }
        return ans;
    }
    
}