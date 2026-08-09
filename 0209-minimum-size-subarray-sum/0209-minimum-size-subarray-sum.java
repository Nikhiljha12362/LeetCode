
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int n = nums.length;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (high = 0; high < n; high++) {
            sum = sum + nums[high];

            while (sum >= target) {
                int length = high - low + 1;

                res = Math.min(res, length);

                sum = sum - nums[low];
                low++;
            }
        }

        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}


