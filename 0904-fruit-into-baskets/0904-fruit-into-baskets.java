class Solution {
    public int totalFruit(int[] fruits) {
        int n =fruits.length;
       
        HashMap<Integer,Integer>f = new HashMap<>();
         int low =0;
        int high =0;
        int res =0;
    
        for( high =0;high<n;high++){
             f.put(fruits[high],f.getOrDefault(fruits[high],0)+1);

            // f[fruits[high]]++; it is a syntax of c++;
            while(f.size()>2){
                // f[fruits[low]]--;
                f.put(fruits[low],f.get(fruits[low])-1);
                if(f.get(fruits[low])==0){
                    f.remove(fruits[low]);
                }
                low++;
            }
            // if(f.size()==2){ atmost 2 bollah na exactly 2 isliye ye codition mhi hoga
                int lenght = high-low+1;
                res = Math.max(res,lenght);
            

        }
        return res;
    }
}