class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;

        // Create first window of size k
        while (high < k) {
            sum += nums[high];
            high++;
        }

        int maxSum = sum;

        // Slide the window
        while (high < n) {

            sum = sum + nums[high];   // Add new element
            sum = sum - nums[low];    // Remove old element

            low++;
            high++;

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}