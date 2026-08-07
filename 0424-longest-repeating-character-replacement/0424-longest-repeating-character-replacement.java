class Solution {
    public int characterReplacement(String s, int k) {
        int low =0;
        int high =0;
        int maxFreq= 0 ;
        int res =0;
        HashMap<Character,Integer>f = new HashMap<>();
        for(high =0;high<s.length();high++){
            char ch = s.charAt(high);
            f.put(ch,f.getOrDefault(ch,0)+1);
            maxFreq =Math.max(maxFreq,f.get(ch));
        
        while((high-low+1)-maxFreq>k){
            char left = s.charAt(low);
            f.put(left,f.get(left)-1);
            if(f.get(left)==0){
                f.remove(left);
            }
            low++;
        }
       
        res = Math.max(high-low+1,res);
        } 
        return res;
    }
}