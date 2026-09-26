class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
      int[]expected = heights.clone();
        Arrays.sort(heights);
        int i =0;
        int count =0;
        for( i=0; i<n; i++){
            if(heights[i]!=expected[i]){
                count++;

            }
        }
        return count;

    }
}