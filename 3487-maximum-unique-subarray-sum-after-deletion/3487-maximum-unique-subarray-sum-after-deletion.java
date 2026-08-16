class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> f = new HashMap<>();

        int sum = 0;
        int maxNegative = Integer.MIN_VALUE;
        boolean hasNonNegative = false;

        for (int num : nums) {

            if (num < 0) {
                maxNegative = Math.max(maxNegative, num);

            } else if (!f.containsKey(num)) {
                sum += num;
                f.put(num, 1);
                hasNonNegative = true;
            }
        }

        return hasNonNegative ? sum : maxNegative;
    }
}