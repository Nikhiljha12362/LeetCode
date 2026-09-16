class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans =0;
        int sum =0;
        int n= nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int res = sum%k;
            if(res<0){//agar negative aaye to us case mei modulo nikalne ka tarika
                res=res+k; 
            }
            if(map.containsKey(res)){
              
                ans+=map.get(res);
            }
            map.put(res,map.getOrDefault(res,0)+1);
        }
       return ans; 
    }
}