class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE/2;
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            int oldNoDelete = noDelete;

            noDelete = Math.max(noDelete + arr[i], arr[i]);

            oneDelete = Math.max(oneDelete + arr[i], oldNoDelete);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}