class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int minlenwindow = Integer.MAX_VALUE;

        while (j < nums.length) {

            sum += nums[j];
            j++;

            while (sum >= target) {

                int currentWindow = j - i;
                minlenwindow = Math.min(minlenwindow, currentWindow);

                sum -= nums[i];
                i++;
            }
        }

        return minlenwindow == Integer.MAX_VALUE ? 0 : minlenwindow;
    }
}