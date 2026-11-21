class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int maxProfit = 0;

        int i = 0;
        int j = 1;

        while (j < n) {

            int profit = prices[j] - prices[i];

            maxProfit = Math.max(maxProfit, profit);

            if (prices[j] < prices[i]) {
                i = j;
                
            }
            j++;

        
        }

        return maxProfit;
    }
}