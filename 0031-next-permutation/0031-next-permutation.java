class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return;
        }

        int indx1 = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                indx1 = i;
                break;
            }
        }

        if (indx1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int indx2 = -1;

        for (int i = n - 1; i > indx1; i--) {
            if (nums[i] > nums[indx1]) {
                indx2 = i;
                break;
            }
        }

        int temp = nums[indx1];
        nums[indx1] = nums[indx2];
        nums[indx2] = temp;

        reverse(nums, indx1 + 1, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}