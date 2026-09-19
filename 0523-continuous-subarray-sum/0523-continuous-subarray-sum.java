class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n =nums.length;
        int ans =0;
        int sum=0;
        HashMap<Integer,Integer>map =new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum =sum+nums[i];
            int res= sum%k;
            if(map.containsKey(res)){
                int indx = map.get(res);
                int length = i-indx;
                 if(length>=2){
                    return true;
                 }
            }else{
                map.put(res,i);
            }
        }
        return false;
    }
}